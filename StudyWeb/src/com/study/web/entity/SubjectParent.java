package com.study.web.entity;
/**
 * 系别分类表
 * @author 刘俊沣
 * @version 1.0
 */
public class SubjectParent {
	/**
	 * 整型的id编号，对应数据表中的id列
	 */
	private int id;
	/**
	 * 字符串类型的sbjparent，对应数据表中的sbjParent列
	 */
	private String sbjparent;
	/**
	 * 无参构造方法，用于实例化实体类<br>
	 * 仅仅用于实例化一个实体
	 */
	public SubjectParent() {
		super();
	}
	/**
	 * 有参构造方法，用于传递参数给实体
	 * @param id
	 * 参数为整型的id编号
	 * @param sbjparent
	 * 参数为字符串类型的系别编号
	 */
	public SubjectParent(int id, String sbjparent) {
		super();
		this.id = id;
		this.sbjparent = sbjparent;
	}
	/**
	 * 获取并返回一个系别的编号
	 * @return
	 * 返回一个整型的系别编号
	 */
	public int getId() {
		return id;
	}
	/**
	 * 获取并保存一个系别编号
	 * @param id
	 * 保存一个整型的系别编号
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取并返回一个系别的名称信息
	 * @return
	 * 返回一个字符串类型的系别信息
	 */
	public String getSbjparent() {
		return sbjparent;
	}
	/**
	 * 获取并保存一个系别的信息
	 * @param sbjparent
	 * 保存一个字符串类型的系别信息
	 */
	public void setSbjparent(String sbjparent) {
		this.sbjparent = sbjparent;
	}
}
