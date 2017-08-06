package com.study.web.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.study.web.dao.SubjectsParentDao;
import com.study.web.entity.SubjectParent;
import com.study.web.util.DBUtil;

public class SubjectsParentDaoImp implements SubjectsParentDao {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private List<SubjectParent> subjectparentlist;
	private SubjectParent subjectParent;
	private int count = -1;
	private String sql = null;
	
	@Override
	public List<SubjectParent> querySubjectParent() {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from SubjectParent";
			pstmt = conn.prepareStatement(sql);
			subjectparentlist = new ArrayList<SubjectParent>();
			rs = pstmt.executeQuery();
			while (rs.next()) {
				subjectParent = new SubjectParent();
				subjectParent.setId(rs.getInt(1));
				subjectParent.setSbjparent(rs.getString(2));
				subjectparentlist.add(subjectParent);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectparentlist;
	}

	@Override
	public List<SubjectParent> querySubjectParentById(int id) {
		// TODO Auto-generated method stub
		try{
			conn = DBUtil.getChonnection();
			sql = "select * from SubjectParent where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			subjectparentlist = new ArrayList<SubjectParent>();
			while(rs.next()){
				subjectParent = new SubjectParent();
				subjectParent.setId(rs.getInt(1));
				subjectParent.setSbjparent(rs.getString(2));
				subjectparentlist.add(subjectParent);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectparentlist;
	}

	@Override
	public List<SubjectParent> querySubjectParentByName(String name) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from SubjectParent where sbjParent = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			subjectparentlist = new ArrayList<SubjectParent>();
			while(rs.next()){
				subjectParent = new SubjectParent();
				subjectParent.setId(rs.getInt(1));
				subjectParent.setSbjparent(rs.getString(2));
				subjectparentlist.add(subjectParent);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectparentlist;
	}

	@Override
	public int addSubjectParent(SubjectParent subjectParent) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "insert into SubjectParent(sbjParent) values(?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, subjectParent.getSbjparent());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int updateSubjectParent(SubjectParent subjectParent) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "update SubjectParent id = ? where sbjParent = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjectParent.getId());
			pstmt.setString(2, subjectParent.getSbjparent());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteSubjectParentById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from SubjectParent where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteSubjectParentByName(String name) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from SubjectParent where sbjparent = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

}
