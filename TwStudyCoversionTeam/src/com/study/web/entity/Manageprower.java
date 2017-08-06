package com.study.web.entity;
/**
 * 权限操作
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class Manageprower {
	/**
	 * 主键编号，id隐藏字段
	 */
	private int id;
	/**
	 * 权限描述
	 */
	private String disc;
	/**
	 * 无参构造方法
	 */
	public Manageprower() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param disc
	 * 权限描述
	 */
	public Manageprower(String disc) {
		super();
		this.disc = disc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
}
