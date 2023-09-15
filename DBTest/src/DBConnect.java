import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	// DB Connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertUser(String id, String name) {
		Connection conn = getConnection();
		String sql = String.format("INSERT INTO user (id, name) VALUES ('%s', '%s')", id, name);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 삽입");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void updateUserName(String id, String name) {
		Connection conn = getConnection();
		String sql = String.format("UPDATE user SET name = '%s' WHERE id = '%s'", name, id);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 수정");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void deleteUser(String id) {
		Connection conn = getConnection();
		String sql = String.format("DELETE FROM user WHERE id = '%s'", id);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 삭제");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void userInfo(String id) {
		Connection conn = getConnection();
		String sql = String.format("SELECT * FROM user WHERE id = '%s'", id);
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null && rs.next()) {
				String rid = rs.getString("id");
				String rname = rs.getString("name");
				System.out.println(rid + "," + rname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void allUserInfo() {
		Connection conn = getConnection();
		String sql = "SELECT * FROM user";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					String rid = rs.getString(1);
					String rname = rs.getString(2);
					System.out.println(rid + "," + rname);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void main(String[] args) {
		// insertUser("ha", "하길동");
		// updateUserName("ha", "하하");
		// deleteUser("ha");
		// userInfo("cha");
		allUserInfo();
	}
}