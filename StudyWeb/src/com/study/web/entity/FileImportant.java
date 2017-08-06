package com.study.web.entity;
/**
 * 审核类型
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class FileImportant {
	/**
	 * 对应id编号，隐藏字段
	 */
	private int id;
	/**
	 * 对应文件审核的类型
	 */
	private String special;
	/**
	 * 无参构造方法
	 */
	public FileImportant() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param special
	 * 文件审核的类型
	 */
	public FileImportant(String special) {
		super();
		this.special = special;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
}
