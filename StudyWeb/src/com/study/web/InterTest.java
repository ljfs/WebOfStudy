package com.study.web;

import com.study.web.internet.Intetnet;

public class InterTest {

	/**
	 * 测试服务器的名称和服务器的ip地址查询
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//显示本机的IP和名称
		System.out.println("服务器名称为："+Intetnet.getServicename()+"\t\t服务器ip为："+Intetnet.getServiceip());
	}
}