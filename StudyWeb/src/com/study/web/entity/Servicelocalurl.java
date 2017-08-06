package com.study.web.entity;
/**
 * <br>服务器的硬盘空间</br>
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class Servicelocalurl {
	/**
	 * <br>对应id列，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>对应服务器路径</br>
	 */
	private String savePath;
	/**
	 * <br>盘符的剩余空间</br>
	 */
	private int pathHomeSize;
	/**
	 * <br>盘符作用的描述</br>
	 */
	private String pathHomedescr;
	/**
	 * 无参构造方法
	 */
	public Servicelocalurl() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param savePath
	 * 盘符路径
	 * @param pathHomeSize
	 * 盘符剩余空间
	 * @param pathHomedescr
	 * 盘符信息描述
	 */
	public Servicelocalurl(String savePath, int pathHomeSize,
			String pathHomedescr) {
		super();
		this.savePath = savePath;
		this.pathHomeSize = pathHomeSize;
		this.pathHomedescr = pathHomedescr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public int getPathHomeSize() {
		return pathHomeSize;
	}
	public void setPathHomeSize(int pathHomeSize) {
		this.pathHomeSize = pathHomeSize;
	}
	public String getPathHomedescr() {
		return pathHomedescr;
	}
	public void setPathHomedescr(String pathHomedescr) {
		this.pathHomedescr = pathHomedescr;
	}
}
