package UTil_Jdbc;

import java.sql.*;

public class JDBC {
	// ���԰Ѽ����ַ�������ɳ������û��������룬URL��������
	private static final String USER = "root";
	private static final String PWD = "dly19980610";
	private static final String URL = "jdbc:mysql://localhost:3306/jsu";
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	/**
	 * ע������(����ʡ��)
	 */
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �õ����ݿ������
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PWD);
	}

	/**
	 * �ر����д򿪵���Դ
	 */
	public static void close(Connection conn, PreparedStatement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * �ر����д򿪵���Դ ����
	 */
	public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		close(conn, stmt);
	}
}
