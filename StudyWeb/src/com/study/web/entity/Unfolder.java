package com.study.web.entity;
/**
 * <br>非文件夹类文件表</br>
 * @author 刘俊沣
 * @version 1.0
 */
public class Unfolder {
	/**
	 * <br>文件表的id序列，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>文件类型的id编号，外键对应文件类型表id</br>
	 */
	private int typeid;
	/**
	 * <br>文件的后缀名称</br>
	 */
	private String fileName;
	public Unfolder() {
		super();
	}
	public Unfolder(int typeid, String fileName) {
		super();
		this.typeid = typeid;
		this.fileName = fileName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
