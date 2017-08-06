package com.study.web.util;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * DBUtil�������ӻ�Ͽ����ݿ�֮�������
 * @author ������
 *
 */
public class DBUtil {
	private InetAddress address;
	/**
	 * ��δ���������Ŀʱ��ȡ������ip��ַ
	 * @return
	 * ����һ��ip��ַ��ɵ��ַ���
	 */
	private String getServiceIp(){
		String ip = null;
		try{
			address = address.getLocalHost();
			ip = address.getHostAddress();
			return ip;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return ip;
	}
	/**
	 * ��̬���������������ݿ�
	 * @return
	 * ����һ�����Ӷ���<br>
	 * ���ڴ���Connection�ı�����
	 */
	public static Connection getChonnection(){
		DBUtil db = new DBUtil();
		//��ȡ����ip��ַ
		String serviceip = db.getServiceIp();
		Connection conn = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://PC-20160214FJYX:1433;databaseName = ManagerDB";
		String user = "sa";
		String pwd = "ljfxwf2015";
		String pwd2 = "123@qwe";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	/**
	 * ͨ�������ֵ��ȡ���ر����ݿ��ж�Ӧ�Ľӿ�<br>
	 * @param conn
	 * @param stmt
	 * @param rs
	 * @return
	 * ����ֵΪ��
	 */
	public static void closeAll(Connection conn,Statement stmt,ResultSet rs){
		try {
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

