package com.study.web.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.study.web.dao.SubjectDao;
import com.study.web.entity.Subjects;
import com.study.web.util.DBUtil;

public class SubjectDaoImp implements SubjectDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	private Subjects subjects;
	private List<Subjects> subjectliList;
	private int count = -1;
	
	@Override
	public List<Subjects> querySubjects() {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from Subjects";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			subjectliList = new ArrayList<Subjects>();
			while (rs.next()) {
				subjects = new Subjects();
				subjects.setId(rs.getInt(1));
				subjects.setSpid(rs.getInt(2));
				subjects.setSbj(rs.getString(3));
				subjectliList.add(subjects);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectliList;
	}

	@Override
	public List<Subjects> querySubjectById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from Subjects where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			subjectliList = new ArrayList<Subjects>();
			while(rs.next()){
				subjects = new Subjects();
				subjects.setId(rs.getInt(1));
				subjects.setSpid(rs.getInt(2));
				subjects.setSbj(rs.getString(3));
				subjectliList.add(subjects);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectliList;
	}

	@Override
	public List<Subjects> querySubjectByParent(String parent) {
		// TODO Auto-generated method stub
		return subjectliList;
	}

	@Override
	public List<Subjects> querySubjectByParentId(int pid) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from where spid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			rs = pstmt.executeQuery();
			subjectliList = new ArrayList<Subjects>();
			while(rs.next()){
				subjects = new Subjects();
				subjects.setId(rs.getInt(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectliList;
	}

	@Override
	public List<Subjects> querySubjectByName(String name) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from Subjects where sbj = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			subjectliList = new ArrayList<Subjects>();
			while (rs.next()) {
				subjects = new Subjects();
				subjects.setId(rs.getInt(1));
				subjects.setSpid(rs.getInt(2));
				subjects.setSbj(rs.getString(3));
				subjectliList.add(subjects);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return subjectliList;
	}

	@Override
	public int addSubject(Subjects subjects) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "insert into Subjects(spid,sbj) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjects.getSpid());
			pstmt.setString(2, subjects.getSbj());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteSubjectById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from Subjects where id = ?";
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
	public int deleteSubjectByName(String name) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from Subjects where sbj = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteSubjectByParent(int pid) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from Subjects where spid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int updateSubject(Subjects subjects) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "update set spid = ?,sbj = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjects.getSpid());
			pstmt.setString(2, subjects.getSbj());
			pstmt.setInt(3, subjects.getId());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}
}