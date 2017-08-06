package com.study.web.entity;
/**
 * <br>文件上传的图片类型表</br>
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class FileIconName {
	/**
	 * <br>图片类型id编号，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>图片类型后缀名</br>
	 */
	private String iconTypeName;
	/**
	 * <br>无参构造方法</br>
	 */
	public FileIconName() {
		super();
	}
	/**
	 * <br>有参构造方法</br>
	 * @param iconTypeName
	 * <br>传入图片类型后缀名</br>
	 */
	public FileIconName(String iconTypeName) {
		super();
		this.iconTypeName = iconTypeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIconTypeName() {
		return iconTypeName;
	}
	public void setIconTypeName(String iconTypeName) {
		this.iconTypeName = iconTypeName;
	}
}
