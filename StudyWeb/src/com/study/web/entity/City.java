package com.study.web.entity;

/**
 * 城市表，用于登记城市信息<br>
 * @version 1.0
 * @author 刘俊沣
 */
public class City {
	/**
	 * 整型的id，对应数据表中的id列<br>
	 * 表示一个主键自增序列
	 */
	private int id;
	/**
	 * 字符串类型的city，对应数据表中的t_city列<br>
	 * 用于保存城市的名称
	 */
	private String city;
	/**
	 * 整型的pid，对应数据表中的pid列，<br>
	 * 保存一个外键，对应Porvince表中的id列
	 */
	private int pid;
	/**
	 * 无参构造方法，用于实例化一个实体类<br>
	 * 仅仅用于实例化
	 */
	public City() {
		super();
	}
	/**
	 * 有参构造方法，用于直接传入参数<br>
	 * 参数为除自增序列之外的其他参数构造方法
	 * @param city
	 * 传入城市的名称信息
	 * @param pid
	 * 传入外键连接的省份id编号
	 */
	public City(String city, int pid) {
		super();
		this.city = city;
		this.pid = pid;
	}
	/**
	 * 有参构造方法，用于直接传入参数<br>
	 * 参数为实体类中的所有属性参数
	 * @param id
	 * 传入参数为城市的id编号
	 * @param city
	 * 传入参数为城市的名称信息
	 * @param pid
	 * 传入参数为城市外键连接的省份id编号
	 */
	public City(int id, String city, int pid) {
		super();
		this.id = id;
		this.city = city;
		this.pid = pid;
	}
	/**
	 * 获取并返回城市的id编号
	 * @return
	 * 返回一个整型的id编号
	 */
	public int getId() {
		return id;
	}
	/**
	 * 获取并保存城市的id编号
	 * @param id
	 * 传入参数为一个整型的城市id编号保存城市的id编号
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取并返回城市的名称
	 * @return
	 * 返回一个字符串类型的城市名称
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 获取并保存城市的名称
	 * @param city
	 * 传入参数为一个字符串类型的城市信息
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取并返回城市外键连接的省份的id信息
	 * @return
	 * 返回参数为一个整型的省份id编号
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * 获取并保存一个整型的pid编号对应一个省份的信息
	 * @param pid
	 * 传入参数为一个整型的pid，外键对应城市所在的省份的信息
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
}
