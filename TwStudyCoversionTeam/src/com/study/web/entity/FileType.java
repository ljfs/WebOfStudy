package com.study.web.entity;
/**
 * <br>文件类型</br>
 * @author 刘俊沣
 * @version 1.0
 */
public class FileType {
	/**
	 * <br>对应列的id编号，字段隐藏</br>
	 */
	private int id;
	/**
	 * <br>上传的类型</br>
	 */
	private String fileType;
	/**
	 * 无参构造方法，用于实例化类
	 */
	public FileType() {
		super();
	}
	/**
	 * <br>有参构造方法</br>
	 * @param fileType
	 * <br>参数对应数据表中的上传类型</br>
	 */
	public FileType(String fileType) {
		super();
		this.fileType = fileType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
