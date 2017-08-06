package com.study.web.entity;

import java.util.Date;

/**
 * 广告信息表
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class Advertisement {
	/**
	 * 广告编号，主键id隐藏字段
	 */
	private int id;
	/**
	 * 上传者编号，对应外键成员编号
	 */
	private int personId;
	/**
	 * 成员身份，对应外键身份编号，默认上传成员为1时可以使用
	 */
	private int ident;
	/**
	 * 广告总主题，上传广告必填内容
	 */
	private String theme;
	/**
	 * 上传日期
	 */
	private Date upperDate;
	/**
	 * 启用日期
	 */
	private Date startDate;
	/**
	 * 广告到期时间，最少3个月
	 */
	private Date endDate;
	/**
	 * 广告审核状态编号，对应外键审核状态id编号
	 */
	private int statusId;
	/**
	 * 无参构造方法
	 */
	public Advertisement() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param personId
	 * 成员编号
	 * @param ident
	 * 身份信息编号
	 * @param theme
	 * 广告主题
	 * @param upperDate
	 * 上传日期
	 * @param startDate
	 * 启用日期
	 * @param endDate
	 * 广告到期时间
	 * @param statusId
	 * 广告审核状态
	 */
	public Advertisement(int personId, int ident, String theme, Date upperDate,
			Date startDate, Date endDate, int statusId) {
		super();
		this.personId = personId;
		this.ident = ident;
		this.theme = theme;
		this.upperDate = upperDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.statusId = statusId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getIdent() {
		return ident;
	}
	public void setIdent(int ident) {
		this.ident = ident;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Date getUpperDate() {
		return upperDate;
	}
	public void setUpperDate(Date upperDate) {
		this.upperDate = upperDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
}
