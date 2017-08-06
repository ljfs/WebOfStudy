package com.study.web.entity;
/**
 * 科目信息实体类
 * @author 刘俊沣
 * @version 1.0
 */
public class Subjects {
	/**
	 * 整型的id编号，对应数据表中的id编号
	 */
	private int id;
	/**
	 * 字符串类型的sbj，对应数据表中的sbj列
	 */
	private String sbj;
	/**
	 * 整型的spid，对应数据表中的spid列
	 */
	private int spid;
	/**
	 * 
	 */
	public Subjects() {
		super();
	}
	/**
	 * 
	 * @param sbj
	 */
	public Subjects(String sbj) {
		super();
		this.sbj = sbj;
	}
	/**
	 * 
	 * @param id
	 * @param sbj
	 */
	public Subjects(int id, String sbj) {
		super();
		this.id = id;
		this.sbj = sbj;
	}
	/**
	 * 
	 * @param id
	 * @param sbj
	 * @param spid
	 */
	public Subjects(int id, String sbj, int spid) {
		super();
		this.id = id;
		this.sbj = sbj;
		this.spid = spid;
	}
	/**
	 * 
	 * @return
	 */
	public int getSpid() {
		return spid;
	}
	/**
	 * 
	 * @param spid
	 */
	public void setSpid(int spid) {
		this.spid = spid;
	}
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public String getSbj() {
		return sbj;
	}
	/**
	 * 
	 * @param sbj
	 */
	public void setSbj(String sbj) {
		this.sbj = sbj;
	}
}
