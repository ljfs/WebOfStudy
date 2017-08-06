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
 * PersionDaoImp���ǶԽӿ�PersionDaoʵ���࣬<br>
 * �������ʵ����PersionDao�ӿ��е����г��󷽷�
 * @version 1.0
 * @author ������
 *
 */
public class PersionDaoImp implements PersionDao {
	/**
	 * �������ϲ�ʵ����
	 */
	private List<Persion> persionlist = null;
	/**
	 * ����һ����Ա��
	 */
	private Persion persion;
	/**
	 * �������Ӷ���
	 */
	private Connection conn;
	/**
	 * ����һ��Statement���Ӷ�������ִ����ɾ�Ĳ����
	 */
	private PreparedStatement pstmt;
	/**
	 * ��������������ڻ�ȡִ��SQL����֮��Ľ����
	 */
	private ResultSet rs;
	/**
	 * ����һ���ַ������ڱ���sql����
	 */
	private String sql;
	/**
	 * ����һ�����ͱ�������ʼֵΪ-1
	 */
	private int count = -1;
	/**
	 * ʵ��ȫ��ķ���
	 * @author ������
	 * @return ����һ�����ͼ�������ΪPersion��<br>
	 * ���з��ص�������Ϊ���ݿ��е�ÿһ������
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
	 * �����������ң�ʵ����PersionDao�ӿ��еĲ�ѯ������<br>
	 * @param ����һ��String���͵Ĳ���������ֵΪһ����Ա������<br>
	 * @return ����һ��������Ա����Ϣ������ȡÿһ�е�ֵ
	 * @author ������
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
	 * ���������Ȳ��ң�ʵ����PersionDao�ӿ��еĳ��󷽷�<br>
	 * @param �������ڴ�������1����0�����в�ѯ��Ա����Ϣ��<br>
	 * �����жϴ���Ĳ����Ƿ�Ϊ1��Ϊ0��<br>
	 * ����������ȡֵ��Χ�ڲ�ִ�д˷�������Ч����
	 * @return ����һ���������������ĳ�Ա�ļ���
	 * @author ������
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
	 * �������ڵ������ң�ʵ����PersionDao�ӿ��еĳ��󷽷�<br>
	 * @param �������������ַ������͵Ĳ�����<br>
	 * ��һ������Ϊʡ�ݣ���Ӧ���ݿ��д����ʡ�ݣ�<br>
	 * �ڶ�������Ϊ��Ա���ڵĳ��У���Ӧ���ݿ��д���ĳ�����Ϣ��<br>
	 * �������Ĳ�����Ҫ�󲻷����������¼����жϣ�<br>
	 * 1����������ʡ��Ϊ�գ�ִ�еĴ���Ϊ����ͨ����ѯ���в��ҷ��ϵĳ�Ա<br>
	 * 2���������ĳ���Ϊ�գ�ִ�еĴ���Ϊ����ͨ����ѯʡ�ݲ��ҷ��������ĳ�Ա<br>
	 * 3����������������������Ϊ�գ�����ѯͬʱ���ڸó�������ʡ�ݵĳ�Ա��Ϣ<br>
	 * 4���������������Ϊ�գ���ִ��ȫ�鷽��<br>
	 * @return ����һ���������������ĳ�Ա��Ϣ
	 * @author ������
	 */
	@Override
	public List<Persion> queryPersionByArear(String provlice, String city) {
		// TODO Auto-generated method stub
		
		if(provlice.equals(null)){
			/**
			 *	 ������ҵ�ʡ��Ϊ��ִ����δ���
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
			 * �����ѯ�ĳ���Ϊ��ִ����δ���
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
			 * ���ȫ������Ϊ��ִ��ȫ��
			 */
			executeQuery();
		}else {
			/**
			 * ���������������Ϊ��ִ����δ���
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
	 * ͨ���Ա���ң�ʵ����PersionDao�ӿ��еĳ��󷽷�<br>
	 * @param ִ�в�ѯ֮ǰ�жϴ���Ĳ����Ƿ�Ϊ�л�Ů��<br>
	 * ����Ա�Ϊ�л�Ůִ�����ݲ�ѯ��<br>
	 * ����ִ�и÷���<br>
	 * @return ���ض�����ϰ���ȫ���ĳ�Ա��Ϣ
	 * @author ������
	 */
	@Override
	public List<Persion> queryPersionBySex(String gender) {
		// TODO Auto-generated method stub
		if (gender.equals("��") || gender.equals("Ů")) {
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
	 * ͨ����Ա��id��Ż�ȡ��Ա����Ϣ��ʵ����PeresionDao�ӿ��еĳ��󷽷�<br>
	 * @param ͨ����ȡ��Ա��id���ֱ�Ӿ�ȷ���ҳ�Ա����Ϣ��<br>
	 * ��������������ײ����Աʹ��<br>
	 * @return �������һ����Ա����Ϣ����<br>
	 * @author ������
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
	 * ͨ����Ա���ֻ��Ż�ȡ��Ա����Ϣ��ʵ����PeresionDao�ӿ��еĳ��󷽷�<br>
	 * @param ͨ����ȡ��Ա���ֻ��Ų��ҳ�Ա����Ϣ��<br>
	 * @return �������һ����Ա����Ϣ����<br>
	 * @author ������
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
	 * ͨ�������С�������ȡ��Ա��Ϣ��ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ��������������������ѧ�����еķֲ����䣨�����������ޣ�����ȡ��Ա������<br>
	 * @return ����ֵΪ���ٺ���һ�����ϵĳ�Ա��Ϣ<br>
	 * @author ������
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
	 * �Գ�Ա������ӣ�ʵ����PersionDao�ӿ��еĳ��󷽷�<br>
	 * @param ����һ�����ϣ������˳�Ա��������Ϣ<br>
	 * @return ����һ�����͵����֣����Ϊ1��ʾ��ӳɹ�<br>
	 * @author ������
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
	 * ͨ��id��Ŷӳ�Ա����ɾ����ʵ����persionDao�ӿڵĳ��󷽷�<br>
	 * @param ����һ����Ա��id��ţ�ͨ��id��ŶԳ�Ա����ɾ��������<br>
	 * �˷���������ײ����Աʹ��<br>
	 * @return ����һ�����͵����֣�������ֵ�ֵΪ1��<br>
	 * ��ʾɾ���ɹ���<br>
	 * ����Ϊɾ��ʧ��<br>
	 * @author ������
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
	 * ͨ����Ա�����Գ�Ա����ɾ����ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ����һ����Ա��������ͨ�������Գ�Ա����ɾ������<br>
	 * @return ����һ�����֣������1��ʾɾ���ɹ�<br>
	 * ���ؽ��Ϊ0��ʾɾ��ʧ��<br>
	 * ���ؽ��Ϊ-1��ʾû��ִ��sql����<br>
	 * @author ������
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
	 * ͨ����Ա���Ա�Գ�Ա����ɾ����ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ����һ����Ա���Ա�ͨ���Ա�Գ�Ա��������ɾ��<br>
	 * ������������ڻ������Աʹ��<br>
	 * @return ����һ�����֣������1��ʾɾ���ɹ�<br>
	 * ���ؽ��Ϊ0��ʾɾ��ʧ��<br>
	 * ���ؽ��Ϊ-1��ʾû��ִ��sql����<br>
	 * @author ������
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
	 * ͨ����Ա�������ȶԳ�Ա����ɾ����ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ����һ����Ա�������ȣ�ͨ�������ȶԳ�Ա��������ɾ��<br>
	 * ����ʹ��Ȩ��Ϊ�ײ����Ա
	 * @return ����һ�����֣������1��ʾɾ���ɹ�<br>
	 * ���ؽ��Ϊ0��ʾɾ��ʧ��<br>
	 * ���ؽ��Ϊ-1��ʾû��ִ��sql����<br>
	 * @author ������
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
	 * ͨ����Ա�����ڵ����Գ�Ա����ɾ����ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ����������������һ������Ϊ��Ա���ڵ�ʡ��<br>
	 * �ڶ�������Ϊ��Ա���ڵĳ���<br>
	 * ������ʹ��Ȩ��Ϊ�ײ����Ա<br>
	 * @return ����һ�����֣������1��ʾɾ���ɹ�<br>
	 * ���ؽ��Ϊ0��ʾɾ��ʧ��<br>
	 * ���ؽ��Ϊ-1��ʾû��ִ��sql����<br>
	 * @author ������
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
	 * ͨ����Ա�ĵ绰����Գ�Ա����ɾ����ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ����һ������Ϊ��Ա���ֻ���<br>
	 * �����Բ��������ֻ��ŵĳ�Ա����ʹ��<br>
	 * �������ֻ�л������Աʹ��<br>
	 * @return ����һ�����֣������1��ʾɾ���ɹ�<br>
	 * ���ؽ��Ϊ0��ʾɾ��ʧ��<br>
	 * ���ؽ��Ϊ-1��ʾû��ִ��sql����<br>
	 * @author ������
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
	 * ͨ����Ա������ζӳ�Ա����ɾ����ʵ����PersionDao�ӿڵĳ��󷽷�<br>
	 * @param ��������������ǰһ��Ϊ��������ޣ���һ��Ϊ���������<br>
	 * ��������ײ����Ա����ʹ��<br>
	 * @return ����һ�����֣������1��ʾɾ���ɹ�<br>
	 * ���ؽ��Ϊ0��ʾɾ��ʧ��<br>
	 * ���ؽ��Ϊ-1��ʾû��ִ��sql����<br>
	 * @author ������
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