package com.study.web.internet;

import java.net.InetAddress;
/**
 * Internet类用于获取网路ip地址，<br>
 * 此外可以在项目中引用这个类创建一个后缀名为.txt的文档，<br>
 * 用于保存获取到的服务器ip和服务器名称
 * @author 刘俊沣
 * @version 1.0.0
 * 
 */
public class Intetnet {
	/**
	 * 
	 * 私有的变量，用于保存服务器的ip地址和服务器的名称
	 * 
	 */
	private static InetAddress address;
	/**
	 * 用于保存服务器的ip地址
	 */
	private static String serviceip;
	/**
	 * 用于保存服务器的名称
	 */
	private static String servicename;
	/**
	 * 用于获取服务器的ip地址<br>
	 * 获取之后返回一个获取的ip地址，<br>
	 * 返回值类型为字符串
	 * 
	 * @author 刘俊沣
	 * @return 返回服务器的ip地址
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
	 * 获取服务器的主机名称，用于验证并保存服务器的ip，<br>
	 * 并可以通过服务器的名称来验证对应的ip地址，<br>
	 * 本方法返回一个字符串，值为本机的名称
	 * @return 
	 * 返回一个服务器的名称
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
