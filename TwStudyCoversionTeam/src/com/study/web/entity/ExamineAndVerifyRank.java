package com.study.web.entity;
/**
 * ÉóºË×´Ì¬
 * @author Áõ¿¡ãã
 * @version 1.0
 *
 */
public class ExamineAndVerifyRank {
	/**
	 * <br>×´Ì¬id±àºÅ£¬Òş²Ø×Ö¶Î</br>
	 */
	private int id;
	/**
	 * <br>ÉóºË×´Ì¬</br>
	 */
	private String passedStatus;
	/**
	 * <br>ÎŞ²Î¹¹Ôì·½·¨</br>
	 */
	public ExamineAndVerifyRank() {
		super();
	}
	/**
	 * <br>ÓĞ²Î¹¹Ôì·½·¨</br>
	 * @param passedStatus
	 * <br>ÉóºË×´Ì¬</br>
	 */
	public ExamineAndVerifyRank(String passedStatus) {
		super();
		this.passedStatus = passedStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassedStatus() {
		return passedStatus;
	}
	public void setPassedStatus(String passedStatus) {
		this.passedStatus = passedStatus;
	}
}
