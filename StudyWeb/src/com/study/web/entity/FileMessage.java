package com.study.web.entity;

import java.util.Date;

/**
 * <br>文件详细信息</br>
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class FileMessage {
	/**
	 * <br>上传文件主键id编号，隐藏字段</br>
	 */
	private int id;
	/**
	 * <br>上传文件所属系别编号</br>
	 */
	private int fileOfSubjectParentId;
	/**
	 * <br>上传文件所属科目编号</br>
	 */
	private int fileOfSubjectId;
	/**
	 * <br>上传文件类型</br>
	 */
	private int fileTypeId;
	/**
	 * <br>上传文件后缀名</br>
	 */
	private int filenameId;
	/**
	 * <br>上传文件标题</br>
	 */
	private String fileText;
	/**
	 * <br>上传文件的成员编号</br>
	 */
	private int fileUpperId;
	/**
	 * <br>文件大小</br>
	 */
	private int fileSize;
	/**
	 * <br>文件上核状态编号</br>
	 */
	private int fileStatueId;
	/**
	 * <br>文件上传日期编号</br>
	 */
	private Date fileSaveDate;
	/**
	 * <br>文件上传图标编号</br>
	 */
	private int fileIconId;
	/**
	 * <br>保存文件所对应的服务器IP地址编号</br>
	 */
	private int fileSaveIPId;
	/**
	 * <br>是否属于专业内容</br>
	 */
	private int specialty;
	/**
	 * <br>文件审核状态</br>
	 */
	private int passed = 1;
	/**
	 * <br>文件审核日期</br>
	 */
	private Date passedDate;
	/**
	 * <br>无参构造方法</br>
	 */
	public FileMessage() {
		super();
	}
	/**
	 * <br>有参构造方法</br>
	 * @param fileOfSubjectParentId
	 * <br>上传文件所属系别编号</br>
	 * @param fileOfSubjectId
	 * <br>上传文件所属科目编号</br>
	 * @param fileTypeId
	 * <br>文件类型</br>
	 * @param filenameId
	 * <br>文件后缀名</br>
	 * @param fileText
	 * <br>文件标题</br>
	 * @param fileUpperId
	 * <br>文件上传成员</br>
	 * @param fileSize
	 * <br>文件大小</br>
	 * @param fileStatueId
	 * <br>文件状态编号</br>
	 * @param fileSaveDate
	 * <br>文件上传日期</br>
	 * @param fileIconId
	 * <br>文件图标编号</br>
	 * @param fileSaveIPId
	 * <br>文件存储服务器IP地址编号</br>
	 * @param specialty
	 * <br>是否属于专业内容</br>
	 * @param passed
	 * <br>文件审核状态</br>
	 * @param passedDate
	 * <br>文件审核日期</br>
	 */
	public FileMessage(int fileOfSubjectParentId, int fileOfSubjectId,
			int fileTypeId, int filenameId, String fileText, int fileUpperId,
			int fileSize, int fileStatueId, Date fileSaveDate, int fileIconId,
			int fileSaveIPId, int specialty, int passed, Date passedDate) {
		super();
		this.fileOfSubjectParentId = fileOfSubjectParentId;
		this.fileOfSubjectId = fileOfSubjectId;
		this.fileTypeId = fileTypeId;
		this.filenameId = filenameId;
		this.fileText = fileText;
		this.fileUpperId = fileUpperId;
		this.fileSize = fileSize;
		this.fileStatueId = fileStatueId;
		this.fileSaveDate = fileSaveDate;
		this.fileIconId = fileIconId;
		this.fileSaveIPId = fileSaveIPId;
		this.specialty = specialty;
		this.passed = passed;
		this.passedDate = passedDate;
	}
	/**
	 * <br>有参构造方法，传入除日期类型文件外的其他文件类型</br>
	 * @param fileOfSubjectParentId
	 * <br>上传文件所属系别编号</br>
	 * @param fileOfSubjectId
	 * <br>上传文件所属科目编号</br>
	 * @param fileTypeId
	 * <br>文件类型</br>
	 * @param filenameId
	 * <br>文件后缀名</br>
	 * @param fileText
	 * <br>文件标题</br>
	 * @param fileUpperId
	 * <br>文件上传成员</br>
	 * @param fileSize
	 * <br>文件大小</br>
	 * @param fileStatueId
	 * <br>文件状态编号</br>
	 * @param fileIconId
	 * <br>文件图标编号</br>
	 * @param fileSaveIPId
	 * <br>文件存储服务器IP地址编号</br>
	 * @param specialty
	 * <br>是否属于专业内容</br>
	 * @param passed
	 * <br>文件审核状态</br>
	 */
	public FileMessage(int fileOfSubjectParentId, int fileOfSubjectId,
			int fileTypeId, int filenameId, String fileText, int fileUpperId,
			int fileSize, int fileStatueId, int fileIconId, int fileSaveIPId,
			int specialty, int passed) {
		super();
		this.fileOfSubjectParentId = fileOfSubjectParentId;
		this.fileOfSubjectId = fileOfSubjectId;
		this.fileTypeId = fileTypeId;
		this.filenameId = filenameId;
		this.fileText = fileText;
		this.fileUpperId = fileUpperId;
		this.fileSize = fileSize;
		this.fileStatueId = fileStatueId;
		this.fileIconId = fileIconId;
		this.fileSaveIPId = fileSaveIPId;
		this.specialty = specialty;
		this.passed = passed;
	}
	/**
	 * <br>有参构造方法，传入非日期类型与非外键类型字段信息</br>
	 * @param fileText
	 * <br>文件标题</br>
	 * @param fileSize
	 * <br>文件大小</br>
	 * @param specialty
	 * <br>是否属于专业内容</br>
	 * @param passed
	 * <br>文件审核状态</br>
	 */
	public FileMessage(String fileText, int fileSize, int specialty, int passed) {
		super();
		this.fileText = fileText;
		this.fileSize = fileSize;
		this.specialty = specialty;
		this.passed = passed;
	}
	/**
	 * <br>有参构造方法，对应表中所有的键</br>
	 * @param id
	 * <br>上传文件主键id编号，隐藏字段</br>
	 * @param fileOfSubjectParentId
	 * <br>上传文件所属科目编号</br>
	 * @param fileOfSubjectId
	 * <br>上传文件所属科目编号</br>
	 * @param fileTypeId
	 * <br>上传文件类型</br>
	 * @param filenameId
	 * <br>上传文件后缀名</br>
	 * @param fileUpperId
	 * <br>上传文件的成员编号</br>
	 * @param fileStatueId
	 * <br>文件上核状态编号</br>
	 * @param fileIconId
	 * <br>文件上传图标编号</br>
	 * @param fileSaveIPId
	 * <br>保存文件所对应的服务器IP地址编号</br>
	 */
	public FileMessage(int id, int fileOfSubjectParentId, int fileOfSubjectId,
			int fileTypeId, int filenameId, int fileUpperId, int fileStatueId,
			int fileIconId, int fileSaveIPId) {
		super();
		this.id = id;
		this.fileOfSubjectParentId = fileOfSubjectParentId;
		this.fileOfSubjectId = fileOfSubjectId;
		this.fileTypeId = fileTypeId;
		this.filenameId = filenameId;
		this.fileUpperId = fileUpperId;
		this.fileStatueId = fileStatueId;
		this.fileIconId = fileIconId;
		this.fileSaveIPId = fileSaveIPId;
	}
	/**
	 * <br>有参构造方法，保存日期</br>
	 * @param fileSaveDate
	 * <br>文件上传日期</br>
	 * @param passedDate
	 * <br>文件审核通过日期</br>
	 */
	public FileMessage(Date fileSaveDate, Date passedDate) {
		super();
		this.fileSaveDate = fileSaveDate;
		this.passedDate = passedDate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getFileOfSubjectParentId() {
		return fileOfSubjectParentId;
	}
	
	public void setFileOfSubjectParentId(int fileOfSubjectParentId) {
		this.fileOfSubjectParentId = fileOfSubjectParentId;
	}
	
	public int getFileOfSubjectId() {
		return fileOfSubjectId;
	}
	
	public void setFileOfSubjectId(int fileOfSubjectId) {
		this.fileOfSubjectId = fileOfSubjectId;
	}
	
	public int getFileTypeId() {
		return fileTypeId;
	}
	
	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}
	
	public int getFilenameId() {
		return filenameId;
	}
	
	public void setFilenameId(int filenameId) {
		this.filenameId = filenameId;
	}
	
	public String getFileText() {
		return fileText;
	}
	
	public void setFileText(String fileText) {
		this.fileText = fileText;
	}
	
	public int getFileUpperId() {
		return fileUpperId;
	}
	
	public void setFileUpperId(int fileUpperId) {
		this.fileUpperId = fileUpperId;
	}
	
	public int getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	
	public int getFileStatueId() {
		return fileStatueId;
	}
	
	public void setFileStatueId(int fileStatueId) {
		this.fileStatueId = fileStatueId;
	}
	
	public Date getFileSaveDate() {
		return fileSaveDate;
	}
	
	public void setFileSaveDate(Date fileSaveDate) {
		this.fileSaveDate = fileSaveDate;
	}
	
	public int getFileIconId() {
		return fileIconId;
	}
	
	public void setFileIconId(int fileIconId) {
		this.fileIconId = fileIconId;
	}
	
	public int getFileSaveIPId() {
		return fileSaveIPId;
	}
	
	public void setFileSaveIPId(int fileSaveIPId) {
		this.fileSaveIPId = fileSaveIPId;
	}
	
	public int getSpecialty() {
		return specialty;
	}
	/**
	 * <br>文件是否为专业内容</br>
	 * @param specialty
	 * <br>传入整型的1或0，否则默认赋值为0</br>
	 */
	public void setSpecialty(int specialty) {
		//判断specialty的值是否为1或0
		if ((specialty == 0) || (specialty ==1)) {
			/*
			 * 如果传入的值为1或0，
			 * 则执行赋值操作
			 */
			this.specialty = specialty;
		}else {
			//否则直接默认赋值为0
			this.specialty = 0;
		}
		
	}
	
	public int getPassed() {
		return passed;
	}
	/**
	 * <br>判断文件审核的状态</br>
	 * @param passed
	 * <br>传入整型数字在0~3之间</br>
	 */
	public void setPassed(int passed) {
		//判断传入的参数是否为0~3之间的数字
		if ((passed == 0)||(passed ==1)||(passed == 2)||(passed == 3)) {
			/*
			 * 如果符合条件则执行赋值操作，
			 * 传入值为1表示为待审核，
			 * 传入值为2表示初审通过，
			 * 传入值为3表示完全通过，
			 * 传入值为0表示不通过
			 */
			this.passed = passed;
		}else if (passed != 1 && passed > 0) {
			/*
			 * 如果执行时传入的值不为1，
			 * 并且大于0，
			 * 对数据不进行任何操作
			 * 
			 */
		}
	}
	
	public Date getPassedDate() {
		return passedDate;
	}
	
	public void setPassedDate(Date passedDate) {
		this.passedDate = passedDate;
	}
}