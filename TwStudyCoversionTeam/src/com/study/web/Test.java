package com.study.web;

//import java.sql.Connection;
import java.util.List;

//import com.google.gson.Gson;
import com.study.web.dao.imp.PersionDaoImp;
import com.study.web.entity.Persion;
//import com.study.web.util.DBUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersionDaoImp pd = new PersionDaoImp();
		List<Persion> list = pd.executeQuery();
		Persion persion = new Persion();
//		Gson gson = new Gson();
		System.out.println("\t\t\t\t\t��ζѧϰѧ�����������Ա��Ϣ");
		System.out.println();
		System.out.println("���ϳ���"+list.size());
		System.out.println("���\t\t����\t\t����\t\t�Ա�\t\tʡ��\t\t����\t\t�ֻ���\t\tQQ\t\t����");
		System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		for (int i = 0; i < list.size(); i++) {
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
//		list.add(persion);
//		String str = gson.toJson(list);
//		
//		System.out.println(str);
//		PersionDaoImp pd = new PersionDaoImp();
//		List<Persion> list = pd.executeQuery();
//		System.out.println("\t\t\t\t\t��ζѧϰѧ�����������Ա��Ϣ");
//		System.out.println();
//		System.out.println();
//		System.out.println("���\t\t����\t\t����\t\t�Ա�\t\tʡ��\t\t����\t\t�ֻ���\t\tQQ\t\t����");
//		System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
//		for (int i = 0; i < list.size(); i++) {
//			Persion persion = list.get(i);
//			System.out.println(persion.getId()+"\t\t"+persion.getName()
//					+"\t\t"+persion.getAge()+"\t\t"+persion.getGender()
//					+"\t\t"+persion.getProvince()+"\t\t"+persion.getCity()
//					+"\t\t"+persion.getMoblePhone()+"\t\t"+persion.getQid()
//					+"\t\t"+persion.getReputation());
//			System.out.println();
//			System.out.println();
//		}
	}

}
