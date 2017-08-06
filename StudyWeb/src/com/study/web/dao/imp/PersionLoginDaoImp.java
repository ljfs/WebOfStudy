package com.study.web.dao.imp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.study.web.dao.PersionLoginDao;
import com.study.web.entity.PersionLogin;
import com.study.web.util.DBUtil;


public class PersionLoginDaoImp implements PersionLoginDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private PersionLogin persionLogin;
	private List<PersionLogin> persionloginlist;
	private String sql;
	private int count;
	@Override
	public List<PersionLogin> queryPersionLoginData() {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from p_login";
			pstmt = conn.prepareStatement(sql);
			persionloginlist = new ArrayList<PersionLogin>();
			rs = pstmt.executeQuery();
			while(rs.next()){
				persionLogin = new PersionLogin();
				/*Userid需要从页面中获取到，
				 * 并在Servlet中进行字符串的转换，
				 * 把字符串转换为数字类型的数据传入数据库查询
				 */
				persionLogin.setUserid(rs.getInt(1));
				persionLogin.setPid(rs.getInt(2));
				persionLogin.setPassword(rs.getString(3));
				persionLogin.setIdent(rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return persionloginlist;
	}

	@Override
	public boolean queryPersionLogin(int userid, String password) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from p_login where userid = ? and password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userid);
			persionloginlist = new ArrayList<PersionLogin>();
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			return rs.first();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
	}

	@Override
	public int addPersionLogin(int persionid, PersionLogin login) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "insert into p_login(pid,password,ident) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, login.getPid());
			pstmt.setString(2, login.getPassword());
			pstmt.setInt(3, persionid);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int updatePassword(String password) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "update p_login set password = ? where userid = ?";
			persionLogin = new PersionLogin();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setInt(2, persionLogin.getUserid());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deletePersionLoginData(PersionLogin persionLogin) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from p_login where userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, persionLogin.getUserid());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deletePersionLoginById(int persionid) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from p_login where userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, persionid);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}
}
