package com.study.web.internet;

import java.net.InetAddress;
/**
 * Internet�����ڻ�ȡ��·ip��ַ��<br>
 * �����������Ŀ����������ഴ��һ����׺��Ϊ.txt���ĵ���<br>
 * ���ڱ����ȡ���ķ�����ip�ͷ���������
 * @author ������
 * @version 1.0.0
 * 
 */
public class Intetnet {
	/**
	 * 
	 * ˽�еı��������ڱ����������ip��ַ�ͷ�����������
	 * 
	 */
	private static InetAddress address;
	/**
	 * ���ڱ����������ip��ַ
	 */
	private static String serviceip;
	/**
	 * ���ڱ��������������
	 */
	private static String servicename;
	/**
	 * ���ڻ�ȡ��������ip��ַ<br>
	 * ��ȡ֮�󷵻�һ����ȡ��ip��ַ��<br>
	 * ����ֵ����Ϊ�ַ���
	 * 
	 * @author ������
	 * @return ���ط�������ip��ַ
	 * 
	 */
	public static String getServiceip() {
		serviceip = null;
		try{
			address = address.getLocalHost();
			serviceip = address.getHostAddress();
			return serviceip;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return serviceip;
	}
	
	
	public void setServiceip(String serviceip) {
		this.serviceip = serviceip;
	}
	
	
	/**
	 * ��ȡ���������������ƣ�������֤�������������ip��<br>
	 * ������ͨ������������������֤��Ӧ��ip��ַ��<br>
	 * ����������һ���ַ�����ֵΪ����������
	 * @return 
	 * ����һ��������������
	 */
	public static String getServicename() {
		servicename = null;
		try {
			address = address.getLocalHost();
			servicename = address.getHostName();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return servicename;
	}
	
	
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	
	
}
