package com.study.web.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.study.web.dao.PersionDao;
import com.study.web.entity.Persion;
import com.study.web.util.DBUtil;
/**
 * PersionDaoImp类是对接口PersionDao实现类，<br>
 * 这个类中实现了PersionDao接口中的所有抽象方法
 * @version 1.0
 * @author 刘俊沣
 *
 */
public class PersionDaoImp implements PersionDao {
	/**
	 * 声明集合并实例化
	 */
	private List<Persion> persionlist = null;
	/**
	 * 声明一个成员类
	 */
	private Persion persion;
	/**
	 * 创建连接对象
	 */
	private Connection conn;
	/**
	 * 创建一个Statement的子对象用于执行增删改查操作
	 */
	private PreparedStatement pstmt;
	/**
	 * 创建结果集，用于获取执行SQL命令之后的结果集
	 */
	private ResultSet rs;
	/**
	 * 创建一个字符窜用于保存sql命令
	 */
	private String sql;
	/**
	 * 创建一个整型变量，初始值为-1
	 */
	private int count = -1;
	/**
	 * 实现全查的方法
	 * @author 刘俊沣
	 * @return 返回一个泛型集合类型为Persion，<br>
	 * 其中返回的列属性为数据库中的每一列属性
	 */
	@Override
	public List<Persion> executeQuery() {
		// TODO Auto-generated method stub
		persionlist = new ArrayList<Persion>();
		conn = DBUtil.getChonnection();
		pstmt = null;
		rs = null;
		try {
			sql = "select * from t_person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				persion = new Persion();
				persion.setId(rs.getInt(1));
				persion.setName(rs.getString(2));
				persion.setAge(rs.getInt(3));
				persion.setGender(rs.getString(4));
				persion.setProvince(rs.getString(5));
				persion.setCity(rs.getString(6));
				persion.setMoblePhone(rs.getString(7));
				persion.setSubject(rs.getString(8));
				persion.setQid(rs.getString(9));
				persion.setReputation(rs.getInt(10));
				persionlist.add(persion);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return persionlist;
	}

	
	/**
	 * 按照姓名查找，实现了PersionDao接口中的查询方法，<br>
	 * @param 传入一个String类型的参数，参数值为一个成员的名字<br>
	 * @return 返回一个或多个成员的信息，并获取每一列的值
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionByName(String name) {
		// TODO Auto-generated method stub
		persionlist = new ArrayList<Persion>();
		conn = DBUtil.getChonnection();
		pstmt = null;
		rs = null;
		try {
			sql = "select * from t_person where pName = '"+name+"'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Persion persion = new Persion();
				persion.setId(rs.getInt(1));
				persion.setName(rs.getString(2));
				persion.setAge(rs.getInt(3));
				persion.setGender(rs.getString(4));
				persion.setProvince(rs.getString(5));
				persion.setCity(rs.getString(6));
				persion.setMoblePhone(rs.getString(7));
				persion.setSubject(rs.getString(8));
				persion.setQid(rs.getString(9));
				persion.setReputation(rs.getInt(10));
				persionlist.add(persion);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return persionlist;
	}

	/**
	 * 按照信誉度查找，实现了PersionDao接口中的抽象方法<br>
	 * @param 方法用于传入数字1或者0来进行查询成员的信息，<br>
	 * 首先判断传入的参数是否为1或为0，<br>
	 * 如果不在这个取值范围内不执行此方法的有效步骤
	 * @return 返回一个或多个符合条件的成员的集合
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionByRequtation(int requation) {
		// TODO Auto-generated method stub
		
		if(requation !=1 || requation != 0){
			
		}else {
			persionlist = new ArrayList<Persion>();
			conn = DBUtil.getChonnection();
			pstmt = null;
			rs = null;
			try {
				sql = "select * from t_person where pRequation = "+requation;
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Persion persion = new Persion();
					persion.setId(rs.getInt(1));
					persion.setName(rs.getString(2));
					persion.setAge(rs.getInt(3));
					persion.setGender(rs.getString(4));
					persion.setProvince(rs.getString(5));
					persion.setCity(rs.getString(6));
					persion.setMoblePhone(rs.getString(7));
					persion.setSubject(rs.getString(8));
					persion.setQid(rs.getString(9));
					persion.setReputation(rs.getInt(10));
					persionlist.add(persion);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				DBUtil.closeAll(conn, pstmt, rs);
			}
			return persionlist;
		}
		return persionlist;
	}

	/**
	 * 按照所在地区查找，实现了PersionDao接口中的抽象方法<br>
	 * @param 方法传入两个字符串类型的参数，<br>
	 * 第一个参数为省份，对应数据库中传入的省份，<br>
	 * 第二个参数为成员所在的城市，对应数据库中传入的城市信息，<br>
	 * 如果传入的参数与要求不符，会有以下几种判断：<br>
	 * 1、如果传入的省份为空，执行的代码为仅仅通过查询城市查找符合的成员<br>
	 * 2、如果传入的城市为空，执行的代码为仅仅通过查询省份查找符合条件的成员<br>
	 * 3、如果传入的两个参数都不为空，将查询同时属于该城市所在省份的成员信息<br>
	 * 4、如果两个参数均为空，则执行全查方法<br>
	 * @return 返回一个或多个符合条件的成员信息
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionByArear(String provlice, String city) {
		// TODO Auto-generated method stub
		
		if(provlice.equals(null)){
			/**
			 *	 如果查找的省份为空执行这段代码
			 */
			persionlist = new ArrayList<Persion>();
			conn = DBUtil.getChonnection();
			pstmt = null;
			rs = null;
			try {
				
				sql = "select * from t_person where pCity = '"+city+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Persion persion = new Persion();
					persion.setId(rs.getInt(1));
					persion.setName(rs.getString(2));
					persion.setAge(rs.getInt(3));
					persion.setGender(rs.getString(4));
					persion.setProvince(rs.getString(5));
					persion.setCity(rs.getString(6));
					persion.setMoblePhone(rs.getString(7));
					persion.setSubject(rs.getString(8));
					persion.setQid(rs.getString(9));
					persion.setReputation(rs.getInt(10));
					persionlist.add(persion);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				DBUtil.closeAll(conn, pstmt, rs);
			}
			return persionlist;
		}else if (city.equals(null)) {
			/**
			 * 如果查询的城市为空执行这段代码
			 */
			persionlist = new ArrayList<Persion>();
			conn = DBUtil.getChonnection();
			pstmt = null;
			rs = null;
			try {
				sql = "select * from t_person where pProvince = '"+provlice+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Persion persion = new Persion();
					persion.setId(rs.getInt(1));
					persion.setName(rs.getString(2));
					persion.setAge(rs.getInt(3));
					persion.setGender(rs.getString(4));
					persion.setProvince(rs.getString(5));
					persion.setCity(rs.getString(6));
					persion.setMoblePhone(rs.getString(7));
					persion.setSubject(rs.getString(8));
					persion.setQid(rs.getString(9));
					persion.setReputation(rs.getInt(10));
					persionlist.add(persion);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				DBUtil.closeAll(conn, pstmt, rs);
			}
			return persionlist;
		}else if (provlice.equals(null) && city.equals(null)) {
			/**
			 * 如果全部条件为空执行全查
			 */
			executeQuery();
		}else {
			/**
			 * 如果所有条件都不为空执行这段代码
			 */
			persionlist = new ArrayList<Persion>();
			conn = DBUtil.getChonnection();
			pstmt = null;
			rs = null;
			try {
				sql = "select * from t_person where pProvince = '"+provlice+"' and pCity = '"+city+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Persion persion = new Persion();
					persion.setId(rs.getInt(1));
					persion.setName(rs.getString(2));
					persion.setAge(rs.getInt(3));
					persion.setGender(rs.getString(4));
					persion.setProvince(rs.getString(5));
					persion.setCity(rs.getString(6));
					persion.setMoblePhone(rs.getString(7));
					persion.setSubject(rs.getString(8));
					persion.setQid(rs.getString(9));
					persion.setReputation(rs.getInt(10));
					persionlist.add(persion);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				DBUtil.closeAll(conn, pstmt, rs);
			}
			return persionlist;
		}
		return persionlist;
	}

	/**
	 * 通过性别查找，实现了PersionDao接口中的抽象方法<br>
	 * @param 执行查询之前判断传入的参数是否为男或女，<br>
	 * 如果性别为男或女执行数据查询，<br>
	 * 否则不执行该方法<br>
	 * @return 返回多个集合包含全部的成员信息
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionBySex(String gender) {
		// TODO Auto-generated method stub
		if (gender.equals("男") || gender.equals("女")) {
			persionlist = new ArrayList<Persion>();
			conn = DBUtil.getChonnection();
			pstmt = null;
			rs = null;
			try {
				sql = "select * from t_person where pGender = '"+gender+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Persion persion = new Persion();
					persion.setId(rs.getInt(1));
					persion.setName(rs.getString(2));
					persion.setAge(rs.getInt(3));
					persion.setGender(rs.getString(4));
					persion.setProvince(rs.getString(5));
					persion.setCity(rs.getString(6));
					persion.setMoblePhone(rs.getString(7));
					persion.setSubject(rs.getString(8));
					persion.setQid(rs.getString(9));
					persion.setReputation(rs.getInt(10));
					persionlist.add(persion);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				DBUtil.closeAll(conn, pstmt, rs);
			}
			return persionlist;
		}
		return persionlist;
	}

	/**
	 * 通过成员的id编号获取成员的信息，实现了PeresionDao接口中的抽象方法<br>
	 * @param 通过获取成员的id编号直接精确查找成员的信息，<br>
	 * 本方法仅仅允许底层管理员使用<br>
	 * @return 返回最多一个成员的信息集合<br>
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionById(int id) {
		// TODO Auto-generated method stub
		persionlist = new ArrayList<Persion>();
		conn = DBUtil.getChonnection();
		pstmt = null;
		rs = null;
		try {
			sql = "select * from t_person where id = "+id;
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Persion persion = new Persion();
				persion.setId(rs.getInt(1));
				persion.setName(rs.getString(2));
				persion.setAge(rs.getInt(3));
				persion.setGender(rs.getString(4));
				persion.setProvince(rs.getString(5));
				persion.setCity(rs.getString(6));
				persion.setMoblePhone(rs.getString(7));
				persion.setSubject(rs.getString(8));
				persion.setQid(rs.getString(9));
				persion.setReputation(rs.getInt(10));
				persionlist.add(persion);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return persionlist;
	}

	/**
	 * 通过成员的手机号获取成员的信息，实现了PeresionDao接口中的抽象方法<br>
	 * @param 通过获取成员的手机号查找成员的信息，<br>
	 * @return 返回最多一个成员的信息集合<br>
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionByPhone(String moblePhone) {
		// TODO Auto-generated method stub
		persionlist = new ArrayList<Persion>();
		conn = DBUtil.getChonnection();
		pstmt = null;
		rs = null;
		try {
			sql = "select * from t_person where pMBP = '"+moblePhone+"'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Persion persion = new Persion();
				persion.setId(rs.getInt(1));
				persion.setName(rs.getString(2));
				persion.setAge(rs.getInt(3));
				persion.setGender(rs.getString(4));
				persion.setProvince(rs.getString(5));
				persion.setCity(rs.getString(6));
				persion.setMoblePhone(rs.getString(7));
				persion.setSubject(rs.getString(8));
				persion.setQid(rs.getString(9));
				persion.setReputation(rs.getInt(10));
				persionlist.add(persion);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return persionlist;
	}

	/**
	 * 通过年龄大小的区间获取成员信息，实现了PersionDao接口的抽象方法<br>
	 * @param 传入两个参数，利用数学中数列的分布区间（函数的上下限）来截取成员的年龄<br>
	 * @return 返回值为至少含有一个集合的成员信息<br>
	 * @author 刘俊沣
	 */
	@Override
	public List<Persion> queryPersionByAge(int minAge, int maxAge) {
		// TODO Auto-generated method stub
		persionlist = new ArrayList<Persion>();
		conn = DBUtil.getChonnection();
		pstmt = null;
		rs = null;
		try {
			sql = "select * from t_person where pAge >= "+minAge+"and pAge >= "+maxAge;
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Persion persion = new Persion();
				persion.setId(rs.getInt(1));
				persion.setName(rs.getString(2));
				persion.setAge(rs.getInt(3));
				persion.setGender(rs.getString(4));
				persion.setProvince(rs.getString(5));
				persion.setCity(rs.getString(6));
				persion.setMoblePhone(rs.getString(7));
				persion.setSubject(rs.getString(8));
				persion.setQid(rs.getString(9));
				persion.setReputation(rs.getInt(10));
				persionlist.add(persion);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return persionlist;
	}

	/**
	 * 对成员进行添加，实现了PersionDao接口中的抽象方法<br>
	 * @param 传入一个集合，包含了成员的所有信息<br>
	 * @return 返回一个整型的数字，如果为1表示添加成功<br>
	 * @author 刘俊沣
	 */
	@Override
	public int addPersion(List<Persion> persionlist) {
		// TODO Auto-generated method stub
		persion = new Persion();
		
		try {
			conn = DBUtil.getChonnection();
			sql = "insert into t_person(pName,pGender,pAge,pProvince,pCity,pMBP,pSubjects,pQId,pReputation) values(?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, persion.getName());
			pstmt.setString(2, persion.getGender());
			pstmt.setInt(3, persion.getAge());
			pstmt.setString(4, persion.getProvince());
			pstmt.setString(5, persion.getCity());
			pstmt.setString(6, persion.getMoblePhone());
			pstmt.setString(7, persion.getSubject());
			pstmt.setString(8, persion.getQid());
			pstmt.setInt(9, 1);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	/**
	 * 通过id编号队成员进行删除，实现了persionDao接口的抽象方法<br>
	 * @param 传入一个成员的id编号，通过id编号对成员进行删除操作，<br>
	 * 此方法仅允许底层管理员使用<br>
	 * @return 返回一个整型的数字，如果数字的值为1，<br>
	 * 表示删除成功，<br>
	 * 否则为删除失败<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletepersionById(int id) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from t_person where id = ?";
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

	/**
	 * 通过成员姓名对成员进行删除，实现了PersionDao接口的抽象方法<br>
	 * @param 传入一个成员的姓名，通过姓名对成员进行删除操作<br>
	 * @return 返回一个数字，如果是1表示删除成功<br>
	 * 返回结果为0表示删除失败<br>
	 * 返回结果为-1表示没有执行sql命令<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletePersionByName(String name) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from t_person where pName = ?";
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

	/**
	 * 通过成员的性别对成员进行删除，实现了PersionDao接口的抽象方法<br>
	 * @param 传入一个成员的性别，通过性别对成员进行批量删除<br>
	 * 这个方法仅限于基层管理员使用<br>
	 * @return 返回一个数字，如果是1表示删除成功<br>
	 * 返回结果为0表示删除失败<br>
	 * 返回结果为-1表示没有执行sql命令<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletePersionBySex(String gender) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from t_person where pGender = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gender);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	/**
	 * 通过成员的信誉度对成员进行删除，实现了PersionDao接口的抽象方法<br>
	 * @param 传入一个成员的信誉度，通过信誉度对成员进行批量删除<br>
	 * 方法使用权限为底层管理员
	 * @return 返回一个数字，如果是1表示删除成功<br>
	 * 返回结果为0表示删除失败<br>
	 * 返回结果为-1表示没有执行sql命令<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletePersionByReputation(int reputation) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from t_person where pReputation = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, reputation);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	/**
	 * 通过成员的所在地区对成员进行删除，实现了PersionDao接口的抽象方法<br>
	 * @param 传入两个参数，第一个参数为成员所在的省份<br>
	 * 第二个参数为成员所在的城市<br>
	 * 方法的使用权限为底层管理员<br>
	 * @return 返回一个数字，如果是1表示删除成功<br>
	 * 返回结果为0表示删除失败<br>
	 * 返回结果为-1表示没有执行sql命令<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletePersionByArea(String province, String city) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from t_person where pProvince = ? and pCity = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, province);
			pstmt.setString(2, city);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	/**
	 * 通过成员的电话号码对成员进行删除，实现了PersionDao接口的抽象方法<br>
	 * @param 传入一个参数为成员的手机号<br>
	 * 仅仅对部分填入手机号的成员可以使用<br>
	 * 这个方法只有基层管理员使用<br>
	 * @return 返回一个数字，如果是1表示删除成功<br>
	 * 返回结果为0表示删除失败<br>
	 * 返回结果为-1表示没有执行sql命令<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletePersionByPhone(String moblePhone) {
		// TODO Auto-generated method stub
		try {
			conn = DBUtil.getChonnection();
			sql = "delete from t_person where pMBP = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, moblePhone);
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	/**
	 * 通过成员的年龄段队成员进行删除，实现了PersionDao接口的抽象方法<br>
	 * @param 传入两个参数，前一个为年龄的下限，后一个为年龄的上限<br>
	 * 这个方法底层管理员可以使用<br>
	 * @return 返回一个数字，如果是1表示删除成功<br>
	 * 返回结果为0表示删除失败<br>
	 * 返回结果为-1表示没有执行sql命令<br>
	 * @author 刘俊沣
	 */
	@Override
	public int deletePersionByAge(int minAge, int maxAge) {
		// TODO Auto-generated method stub
		try{
			conn = DBUtil.getChonnection();
			sql = "delete from t_preson where pAge >= ? and pAge <= ?";
			pstmt.setInt(1, minAge);
			pstmt.setInt(2, maxAge);
			count = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtil.closeAll(conn, pstmt, rs);
		}
		return count;
	}

	/**
	 * 
	 */
	@Override
	public int queryAndUpdateReputationById(int id) {
		// TODO Auto-generated method stub
		return count;
	}

	/**
	 * 
	 */
	@Override
	public int queryAndUpdateReputationByName(String name) {
		// TODO Auto-generated method stub
		return count;
	}

	/**
	 * 
	 */
	@Override
	public int queryAndUpdateReputationByQId(String qq) {
		// TODO Auto-generated method stub
		return count;
	}

	/**
	 * 
	 */
	@Override
	public int executeUpdate(List<Persion> persionList) {
		// TODO Auto-generated method stub
		return count;
	}
}