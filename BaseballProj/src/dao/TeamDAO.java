package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Team;

public class TeamDAO {
	// Connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties(); // Property 사용
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));
			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"), db.getProperty("password"));
		} catch (Exception e) {
			// File 예외처리와 getConnection의 예외를 한번에 처리)
			e.printStackTrace();
		}
		return conn;
	}

	// Close
	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertTeam(Team team) {
		Connection conn = getConnection();
		int cnt = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO team (name, local) VALUES (?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLocal());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return cnt;
	}

	public Team selectTeam(String teamName) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Team team = null;
		String sql = "SELECT * FROM team WHERE name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				team = new Team(rs.getInt("num"), rs.getString("name"), rs.getString("local"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return team;
	}

	public List<Team> selectTeamList() {
		Connection conn = getConnection();
		List<Team> teamList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM team";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					while (rs.next()) {
						teamList.add(new Team(rs.getInt("num"), rs.getString("name"), rs.getString("local")));
					}
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return teamList;
	}
}