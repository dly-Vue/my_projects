package UTil_Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class UserInfo {
	static ResultSet rs;
	static Connection conn ;
	static PreparedStatement pastmt;
	//�����û���Ϣ
	public static void saveUser(String sql, String userName, String userPassword, int profession) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, userName);
			pastmt.setString(2, userPassword);
			pastmt.setInt(3, profession);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    //���Ҳֿ����Ա
	public static ResultSet selectUser(String sql, String userName, String userPassword) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, userName);
			pastmt.setString(2, userPassword);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//������Ϣ
	public static ResultSet selectUs(String sql, String userName) {
			try {
				conn = (Connection) JDBC.getConnection();
				pastmt = (PreparedStatement) conn.prepareStatement(sql);
				pastmt.setString(1, userName);
				rs = pastmt.executeQuery();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}
	//���Ҳֿ����Ա
	public static ResultSet selectUser02(String sql,int sign) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setInt(1,sign);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	//�û���¼��ѯ
	public static ResultSet selectUser01(String sql, String userName, String userPassword,int sign) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, userName);
			pastmt.setString(2, userPassword);
			pastmt.setInt(3,sign);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//ɾ���ֿ����Ա
	public static void deleteUser(String sql, String userName, String userID) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, userName);
			pastmt.setString(2, userID);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�޸��û�����
	public static void updateUser(String sql,String userName, String oldPassword,String newPassword) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, newPassword);
			pastmt.setString(2, userName);
			pastmt.setString(3,oldPassword);	
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updatePerson(String sql,String userName, String userID,String userIphone,String userAddress,String userName1,String userPassword) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, userName);
		    pastmt.setString(2,userID);
		    pastmt.setString(3, userIphone);
		    pastmt.setString(4, userAddress);
		    pastmt.setString(5,userName);
		    pastmt.setString(6,userPassword);
		    pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�ر����ݿ�
	
	public static void close() {
		JDBC.close(conn, pastmt);
	}
	
}
