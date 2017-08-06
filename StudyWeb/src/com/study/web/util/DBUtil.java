package com.study.web.util;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * DBUtil用于连接或断开数据库之间的连接
 * @author 刘俊沣
 *
 */
public class DBUtil {
	private InetAddress address;
	/**
	 * 在未完成整个项目时获取本机的ip地址
	 * @return
	 * 返回一个ip地址组成的字符串
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
	 * 静态方法用于连接数据库
	 * @return
	 * 返回一个连接对象，<br>
	 * 用于传入Connection的变量中
	 */
	public static Connection getChonnection(){
		DBUtil db = new DBUtil();
		//获取本机ip地址
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
	 * 通过传入的值获取并关闭数据库中对应的接口<br>
	 * @param conn
	 * @param stmt
	 * @param rs
	 * @return
	 * 返回值为空
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

