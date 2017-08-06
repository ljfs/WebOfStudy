package com.study.web.entity;

import java.util.Date;
/**
 * 权限表
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class prower {
	/**
	 * 主键编号，隐藏字段
	 */
	private int id;
	/**
	 * 对应功能表中的功能，非空，唯一
	 */
	private String manage;
	/**
	 * 直接传入表名操作权限
	 */
	private String checkeds;
	/**
	 * 功能的父节点
	 */
	private String objectnode;
	/**
	 * 功能的子节点
	 */
	private String childnode;
	/**
	 * 修改权限的执行者，外键对应成员信息编号
	 */
	private int changepersonId;
	/**
	 * 可执行权限操作的角色
	 */
	private int orderident;
	/**
	 * 修改角色操作权限的时间
	 */
	private Date changedate;
	/**
	 * 无参构造方法
	 */
	public prower() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param manage
	 * 对应功能表中的功能，非空，唯一
	 * @param checkeds
	 * 直接传入表名操作权限
	 * @param objectnode
	 * 功能的父节点
	 * @param childnode
	 * 功能的子节点
	 * @param changepersonId
	 * 修改权限的执行者，外键对应成员信息编号
	 * @param orderident
	 * 可执行权限操作的角色
	 * @param changedate
	 * 修改角色操作权限的时间
	 */
	public prower(String manage, String checkeds, String objectnode,
			String childnode, int changepersonId, int orderident,
			Date changedate) {
		super();
		this.manage = manage;
		this.checkeds = checkeds;
		this.objectnode = objectnode;
		this.childnode = childnode;
		this.changepersonId = changepersonId;
		this.orderident = orderident;
		this.changedate = changedate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManage() {
		return manage;
	}
	public void setManage(String manage) {
		this.manage = manage;
	}
	public String getCheckeds() {
		return checkeds;
	}
	public void setCheckeds(String checkeds) {
		this.checkeds = checkeds;
	}
	public String getObjectnode() {
		return objectnode;
	}
	public void setObjectnode(String objectnode) {
		this.objectnode = objectnode;
	}
	public String getChildnode() {
		return childnode;
	}
	public void setChildnode(String childnode) {
		this.childnode = childnode;
	}
	public int getChangepersonId() {
		return changepersonId;
	}
	public void setChangepersonId(int changepersonId) {
		this.changepersonId = changepersonId;
	}
	public int getOrderident() {
		return orderident;
	}
	public void setOrderident(int orderident) {
		this.orderident = orderident;
	}
	public Date getChangedate() {
		return changedate;
	}
	public void setChangedate(Date changedate) {
		this.changedate = changedate;
	}
}
