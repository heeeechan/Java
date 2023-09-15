package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Player;

public class PlayerDAO {
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

	public int insertPlayer(Player player) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "SELECT INTO player (name, backnum, teamnum, teamname) VALUES (?, ?, ?)";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, player.getName());
			pstmt.setInt(2, player.getBacknum());
			pstmt.setString(3, player.getTeamname());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return cnt;
	}

	public List<Player> selectPlayerByName(String name) {
		Connection conn = getConnection();
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "FROM player p JOIN team t ON p.teamnum = t.num " + "WHERE p.name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					playerList.add(new Player(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
				}
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
		return playerList;
	}

	public List<Player> selectPlayerByBacknum(Integer backnum) {
		Connection conn = getConnection();
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "FROM player p JOIN team t ON p.teamnum = t.num " + "WHERE p.backname = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, backnum);
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					playerList.add(new Player(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
				}
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
		return playerList;
	}

	public Player selectPlayerByNum(Integer num) {
		Connection conn = getConnection();
		Player player = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "FROM player p JOIN team t ON p.teamnum = t.num " + "WHERE p.num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				player = new Player(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
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
		return player;
	}

	public List<Player> selectPlayerByTeam(String teamName) {
		Connection conn = getConnection();
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM player p JOIN team t ON p.teamnum = t.num " + "WHERE t.name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					playerList.add(new Player(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
				}
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
		return playerList;
	}
}