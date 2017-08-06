package com.study.web.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.study.web.dao.AreaDao;
import com.study.web.entity.City;
import com.study.web.entity.Province;
import com.study.web.util.DBUtil;

public class AreaDaoImp implements AreaDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	private Province province;
	private City city;
	private List<Province> provincelist;
	private List<City> citylist;
	private int count = -1;
	@Override
	public List<Province> queryProvice() {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from Province";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			provincelist = new ArrayList<Province>();
			while (rs.next()) {
				province = new Province();
				province.setId(rs.getInt(1));
				province.setProvince(rs.getString(2));
				provincelist.add(province);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return provincelist;
	}

	@Override
	public List<Province> queryProvinceById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from Province where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			provincelist = new ArrayList<Province>();
			while (rs.next()) {
				province = new Province();
				province.setId(rs.getInt(1));
				province.setProvince(rs.getString(2));
				provincelist.add(province);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return provincelist;
	}

	@Override
	public List<Province> queryProvinceByName(String province) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from Provnce where Province = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, province);
			rs = pstmt.executeQuery();
			provincelist = new ArrayList<Province>();
			while (rs.next()) {
				this.province = new Province();
				this.province.setId(rs.getInt(1));
				this.province.setProvince(rs.getString(2));
				provincelist.add(this.province);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return provincelist;
	}

	@Override
	public List<City> queryCity() {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from City";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			citylist = new ArrayList<City>();
			while (rs.next()) {
				city = new City();
				city.setId(rs.getInt(1));
				city.setCity(rs.getString(2));
				city.setPid(rs.getInt(3));
				citylist.add(city);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return citylist;
	}

	@Override
	public List<City> queryCityByProvinceId(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from City where pid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			citylist = new ArrayList<City>();
			while (rs.next()) {
				city = new City();
				city.setId(rs.getInt(1));
				city.setCity(rs.getString(2));
				city.setPid(rs.getInt(3));
				citylist.add(city);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return citylist;
	}

	@Override
	public List<City> queryCityById(int id) {
		// TODO Auto-generated method stub
		
		try {
			conn = DBUtil.getChonnection();
			sql = "select * from City where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			citylist = new ArrayList<City>();
			while(rs.next()){
				city = new City();
				city.setId(rs.getInt(1));
				city.setCity(rs.getString(2));
				city.setPid(rs.getInt(3));
				citylist.add(city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		
		return citylist;
	}

	@Override
	public List<City> queryCityByName(String city) {
		// TODO Auto-generated method stub
		try{
			conn = DBUtil.getChonnection();
			sql = "select * from City where t_city = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city);
			rs = pstmt.executeQuery();
			citylist = new ArrayList<City>();
			while(rs.next()){
				this.city = new City();
				this.city.setId(rs.getInt(1));
				this.city.setCity(rs.getString(2));
				this.city.setPid(rs.getInt(3));
				citylist.add(this.city);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return citylist;
	}

	@Override
	public int addProvince(Province province) {
		// TODO Auto-generated method stub
		try{
			conn = DBUtil.getChonnection();
			sql = "insert into Province(Province) values(?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, province.getProvince());
			count = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int addCity(City city) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "insert into City(t_city,pid) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getCity());
			pstmt.setInt(2, city.getPid());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int updateProvince(Province province) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "update Province id = ? where province = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, province.getId());
			pstmt.setString(2, province.getProvince());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int updateCity(City city) {
		// TODO Auto-generated method stub
		try{
			conn = DBUtil.getChonnection();
			sql = "update City id = ? where p_city = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, city.getId());
			pstmt.setString(2, city.getCity());
			count = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteProvinceByName(String province) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from Province where Province = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, province);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteProvinceById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from Province where id = ?";
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
	public int deleteCityById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from City where id = ?";
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
	public int deleteCityByName(String city) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from City where t_city = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public int deleteCityByProvinceId(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from City where pid = ?";
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
}