package com.study.web.baseentity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;



public class BaseEntity<T> implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	protected int id;
	/**
	 * 
	 */
	protected String name;
	/**
	 * 
	 */
	protected Date enterDate;
	public BaseEntity() {
		super();
	}
	
	public int getId() {
		return id;
	}
	@Id
	public void setId(int id) {
		this.id = id;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}