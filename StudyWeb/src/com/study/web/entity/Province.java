package com.study.web.entity;
/**
 * 省份选择表
 * @author 刘俊沣
 * @version 1.0
 */
public class Province {
	/**
	 * 整型的id编号，对应数据表中的省份id<br>
	 * 用于保存省份的编号
	 */
	private int id;
	/**
	 * 字符串类型的province，对应数据表中的Province列<br>
	 * 用于保存省份的信息
	 */
	private String province;
	/**
	 * 无参构造方法，用于实例化<br>
	 * 仅仅用于实例化实体类
	 */
	public Province() {
		super();
	}
	/**
	 * 有参构造方法，用于直接传递参数<br>
	 * 传递的参数为实体类中的所有参数
	 * @param id
	 * 传入参数为省份的id编号
	 * @param province
	 * 传入的参数为省份的名称信息
	 */
	public Province(int id, String province) {
		super();
		this.id = id;
		this.province = province;
	}
	/**
	 * 获取并返回一个省份的id编号<br>
	 * @return
	 * 返回一个整型的省份id编号
	 */
	public int getId() {
		return id;
	}
	/**
	 * 获取并保存一个省份的id编号
	 * @param id
	 * 保存一个整型的省份编号
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取并返回一个省份的信息
	 * @return
	 * 返回一个字符串类型的省份信息
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 获取并保存一个省份的信息
	 * @param province
	 * 保存一个字符串类型的省份信息
	 */
	public void setProvince(String province) {
		this.province = province;
	}
}
