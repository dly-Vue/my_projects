package UTil_Jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;


public class GoodsInfo {
	static ResultSet rs;
	static Connection conn ;
	static PreparedStatement pastmt;
	
	//�������������Ʒ
	public static void saveInStorageGoods(String sql,String goodsName,int goodsID,int goodsNumber,java.util.Date newdate,String goodsPerson,String goodsType,float goodsPrice) {
		try {
			 java.sql.Date date = new java.sql.Date(newdate.getTime());
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, goodsName);
			pastmt.setInt(2, goodsID);
			pastmt.setInt(3, goodsNumber);
			pastmt.setDate(4,date);
			pastmt.setString(5,goodsPerson);
			pastmt.setString(6,goodsType);
			pastmt.setFloat(7, goodsPrice);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��������������Ʒ
	public static void saveOutStorageGoods(String sql,String goodsName,int goodsID,int goodsNumber,Date goodsOutStorageDate,String goodsPerson,String goodsType,float goodsPrice) {
		try {
			java.sql.Date date = new java.sql.Date(goodsOutStorageDate.getTime());
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, goodsName);
			pastmt.setInt(2, goodsID);
			pastmt.setInt(3, goodsNumber);
			pastmt.setDate(4,date);
			pastmt.setString(5,goodsPerson);
			pastmt.setString(6,goodsType);
			pastmt.setFloat(7, goodsPrice);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��Ʒ����
	public static void saveGoods(String sql,String goodsName,int goodsID,float goodsPrice,int goodsNumber,String goodsType) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, goodsName);
			pastmt.setInt(2, goodsID);
			pastmt.setFloat(3, goodsPrice);
			pastmt.setInt(4, goodsNumber);
			pastmt.setString(5,goodsType);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//������Ʒ���ֺ���ƷID����������Ʒ
	public static ResultSet selectGoods(String sql, String goodsName, int goodsID) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, goodsName);
			pastmt.setInt(2, goodsID);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//��ѯ������������
	public static ResultSet selectStorageGoods01(String sql) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//�������Բ�����Ʒ
		public static ResultSet selectType(String sql,String type) {
			try {
				
				conn = (Connection) JDBC.getConnection();
				pastmt = (PreparedStatement) conn.prepareStatement(sql);
				pastmt.setString(1, type);
				rs = pastmt.executeQuery();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}
	//��ѯ����������Ʒ������
	public static ResultSet selectTypeNumber(String sql) {
			try {
				
				conn = (Connection) JDBC.getConnection();
				pastmt = (PreparedStatement) conn.prepareStatement(sql);
				rs = pastmt.executeQuery();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}	
		
	//����ʱ�������Ʒ
	public static ResultSet selectStorageGoods(String sql,Date date2) {
		try {
			java.sql.Date date = new java.sql.Date(date2.getTime());
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setDate(1, date);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}//������Ʒ
	public static ResultSet select(String sql) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			rs = pastmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//�޸���Ʒ������
	public static void updateGoods(String sql,float goodsPrice,int goodsNumber,String goodsType,java.util.Date newdate,String goodsPerson,String goodsName,int goodsID) {
		try {
			java.sql.Date date = new java.sql.Date(newdate.getTime());
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setFloat(1, goodsPrice);
			pastmt.setInt(2, goodsNumber);
			pastmt.setString(3, goodsType);
			pastmt.setDate(4, date);
			pastmt.setString(5, goodsPerson);
			pastmt.setString(6,goodsName);
			pastmt.setInt(7, goodsID);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//�޸���Ʒ������
	public static void updateNumber(String sql,int goodsNumber,String goodsName,int goodsID) {
		try {
			
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);

			pastmt.setInt(1, goodsNumber);
			pastmt.setString(2,goodsName);
			pastmt.setInt(3, goodsID);
			pastmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//ɾ����Ʒ
	public static void deletGoods(String sql,String goodsName,int goodsID) {
		try {
			conn = (Connection) JDBC.getConnection();
			pastmt = (PreparedStatement) conn.prepareStatement(sql);
			pastmt.setString(1, goodsName);
			pastmt.setInt(2, goodsID);
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
