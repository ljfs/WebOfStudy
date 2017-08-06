package com.study.web.entity;
/**
 * <br>图片信息表</br>
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class FileIcon {
	/**
	 * <br>图片信息id编号，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>图片信息获取路径</br>
	 */
	private String fileIconSetPath;
	/**
	 * <br>图片信息上传保存路径</br>
	 */
	private String fileIconSavePath;
	/**
	 * <br>图片名称</br>
	 */
	private String fileIconName;
	/**
	 * <br>图片后缀名编号</br>
	 */
	private String fileIconNameId;
	/**
	 * 无参构造方法
	 */
	public FileIcon() {
		super();
	}
	/**
	 * 有参构造方法
	 * @param fileIconSetPath
	 * <br>图片信息获取路径</br>
	 * @param fileIconSavePath
	 * <br>图片信息上传保存路径</br>
	 * @param fileIconName
	 * <br>图片名称</br>
	 * @param fileIconNameId
	 * <br>图片后缀名编号</br>
	 */
	public FileIcon(String fileIconSetPath, String fileIconSavePath,
			String fileIconName, String fileIconNameId) {
		super();
		this.fileIconSetPath = fileIconSetPath;
		this.fileIconSavePath = fileIconSavePath;
		this.fileIconName = fileIconName;
		this.fileIconNameId = fileIconNameId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileIconSetPath() {
		return fileIconSetPath;
	}
	public void setFileIconSetPath(String fileIconSetPath) {
		this.fileIconSetPath = fileIconSetPath;
	}
	public String getFileIconSavePath() {
		return fileIconSavePath;
	}
	public void setFileIconSavePath(String fileIconSavePath) {
		this.fileIconSavePath = fileIconSavePath;
	}
	public String getFileName() {
		return fileIconName;
	}
	public void setFileName(String fileIconName) {
		this.fileIconName = fileIconName;
	}
	public String getFileIconNameId() {
		return fileIconNameId;
	}
	public void setFileIconNameId(String fileIconNameId) {
		this.fileIconNameId = fileIconNameId;
	}
}
