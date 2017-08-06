package com.study.web.mysql.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.study.web.entity.Persion;
import com.study.web.mysql.dao.PersionDao;

public class MyBatisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBatisTest test = new MyBatisTest();
		System.out.println(test.selectTopNews().size());
		Persion persion;
		List<Persion> list;
		list = test.selectTopNews();
		for (int i = 0; i < test.selectTopNews().size(); i++) {
			persion = list.get(i);
			int id = persion.getId();
			String name = persion.getName();
			String gender = persion.getGender();
			int age = persion.getAge();
			String province = persion.getProvince();
			String city = persion.getCity();
			String moblephone = persion.getMoblePhone();
			String qq = persion.getQid();
			int reputation = persion.getReputation();
			System.out.println(id+"\t\t"+name+"\t\t"+age+"\t\t"+gender+"\t\t"+province+"\t\t"+city+"\t\t"+moblephone+"\t\t"+qq+"\t\t"+reputation);
			System.out.println();
			System.out.println();
		}
	}
	
	public List<Persion> selectTopNews() {
		
		
		String configFile ="com/study/web/mysql/util/mybatis-config.xml";
		InputStream in = null;
		SqlSessionFactory sf = null;
		SqlSession session = null;
		List<Persion> personList = null;
		try {
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			in = Resources.getResourceAsStream(configFile);
			sf = builder.build(in);
			session = sf.openSession();
			//通过session的映射关系得到PersoinDao接口并实现
			PersionDao persiondao = session.getMapper(PersionDao.class);
			//获取xml文件中所有查询到的结果集合
			personList = persiondao.queryAllPersion();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return personList;
	}

}
