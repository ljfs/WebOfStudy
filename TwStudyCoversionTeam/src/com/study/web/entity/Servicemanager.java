package com.study.web.entity;
/**
 * <br>服务器信息表</br>
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class Servicemanager {
	/**
	 * <br>服务器id编号，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>对应服务器名称字段</br>
	 */
	private String serviceName;
	/**
	 * <br>对应服务器的ip地址字段</br>
	 */
	private String serviceIp;
	/**
	 * <br>对应服务器的状态，0为关闭，1为启用</br>
	 */
	private int serviceStatue;
	/**
	 * 无参构造方法
	 */
	public Servicemanager() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param serviceName
	 * <br>服务器名称</br>
	 * @param serviceIp
	 * <br>服务器Ip地址</br>
	 * @param serviceStatue
	 * <br>服务器状态</br>
	 */
	public Servicemanager(String serviceName, String serviceIp,
			int serviceStatue) {
		super();
		this.serviceName = serviceName;
		this.serviceIp = serviceIp;
		if (serviceStatue >=0 || serviceStatue <= 1) {
			this.serviceStatue = serviceStatue;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceIp() {
		return serviceIp;
	}
	public void setServiceIp(String serviceIp) {
		this.serviceIp = serviceIp;
	}
	public int getServiceStatue() {
		return serviceStatue;
	}
	public void setServiceStatue(int serviceStatue) {
		//判断传入参数是否为1或0
		if (serviceStatue >=0 || serviceStatue <= 1) {
			//如果是，则对类中的属性进行赋值
			this.serviceStatue = serviceStatue;
		}
	}
}
