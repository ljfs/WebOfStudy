package com.study.web.entity;
/**
 * <br>对应数据库中的成员身份表</br>
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class Ident {
	/**
	 * <br>id对应列的自增编号，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>对应成员的身份名称</br>
	 */
	private String identityName;
	/**
	 * 无参构造方法，英语实例化身份
	 */
	public Ident() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param identityName
	 * <br>参数对应成员身份字段</br>
	 */
	public Ident(String identityName) {
		super();
		this.identityName = identityName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentityName() {
		return identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}
}
