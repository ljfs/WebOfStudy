package com.study.web.entity;
/**
 * 文件审核日志表
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class FileStatusLog {
	/**
	 * 主键序列号，对应id隐藏字段
	 */
	private int id;
	/**
	 * 文件编号，对应外键文件信息表中的主键
	 */
	private int fileId;
	/**
	 * 文件审核状态，对应外键审核状态表中的主键
	 */
	private int passedStatusId;
	/**
	 * 文件审核状态的备注，说明到达这一状态的原因
	 */
	private String passedStatusRemark;
	/**
	 * 对于审核未通过的进行备注
	 */
	private String remark;
	/**
	 * 无参构造方法
	 */
	public FileStatusLog() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param fileId
	 * 文件id编号
	 * @param passedStatusId
	 * 文件上传状态id编号
	 * @param passedStatusRemark
	 * 文件上传状态备注
	 * @param remark
	 * 文件最终备注
	 */
	public FileStatusLog(int fileId, int passedStatusId,
			String passedStatusRemark, String remark) {
		super();
		this.fileId = fileId;
		this.passedStatusId = passedStatusId;
		this.passedStatusRemark = passedStatusRemark;
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public int getPassedStatusId() {
		return passedStatusId;
	}
	public void setPassedStatusId(int passedStatusId) {
		this.passedStatusId = passedStatusId;
	}
	public String getPassedStatusRemark() {
		return passedStatusRemark;
	}
	public void setPassedStatusRemark(String passedStatusRemark) {
		this.passedStatusRemark = passedStatusRemark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
