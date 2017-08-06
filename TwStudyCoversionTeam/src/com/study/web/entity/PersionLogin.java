package com.study.web.entity;


/**
 * 登录实体登录表
 * @author 刘俊沣
 * @version 1.0
 */
public class PersionLogin {
	/**
	 * 成员登陆时用的帐号，对应登录信息表中的userid列，<br>
	 * 主键自增序列，自增从10000起
	 */
	private int userid;
	/**
	 * 整型外键，对应成员的id编号，用于查找成员的信息<br>
	 * 用于引用外键信息
	 */
	private int pid;
	/**
	 * 
	 */
	private String password;
	/**
	 * ident保存成员身份，其中0，1分别表示学习成员，老师，<br>
	 * 2为管理员，3为底层管理，4为基层管理，<br>
	 * 基层管理具有以上所有的权限，底层管理具有除基层管理之外的权限<br>
	 * 以此类推...
	 */
	private int ident;
	/**
	 * 无参构造方法，用于实例化一个实体类<br>
	 * 仅仅用于实例化
	 */
	public PersionLogin() {
		super();
	}
	/**
	 * 有参构造方法，用于直接传入所有参数<br>
	 * 实例化之后可以保存所有的参数到实体类中
	 * @param userid
	 * 传入参数为成员的帐号
	 * @param pid
	 * 传入成员的id编号
	 * @param password
	 * 传入成员的注册密码
	 * @param ident
	 * 传入成员的身份编号
	 */
	public PersionLogin(int userid, int pid, String password, int ident) {
		super();
		this.userid = userid;
		this.pid = pid;
		//查看密码是否为6~16位
		if(password.length() >= 6 && password.length() <= 16){
			//如果符合条件可以登记密码
			this.password = password;
		}else {
			//否则密码为空
			this.password = null;
		}
		//判断身份编号是否合法
		if(ident >= 0 &&ident <= 4){
			//如果合法保存身份编号
			this.ident = ident;
		}else{
			//否则默认为普通成员
			this.ident = 0;
		}
	}
	/**
	 * 获取并返回成员账号
	 * @return
	 * 返回一个整型的成员账号信息
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * 获取并保存成员的账号
	 * @param userid
	 * 保存一个成员的账号信息
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * 获取并返回一个外键，用于对应成员的id信息
	 * @return
	 * 返回一个整型的pid编号对应成员的id编号
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * 获取并保存一个成员的id编号
	 * @param pid
	 * 保存成员的一个id编号
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * 获取并返回一个成员的密码
	 * @return
	 * 返回一个字符串类型的成员密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 获取并保存成员的密码
	 * @param password
	 * 获取一组长度为6~16位的字符串来保存成员的密码
	 */
	public void setPassword(String password) {
		//查看密码是否为6~16位
		if(password.length() >= 6 && password.length() <= 16){
			//如果符合条件可以登记密码
			this.password = password;
		}else {
			//否则密码为空
			this.password = null;
		}
	}
	/**
	 * 获取并返回成员的身份信息
	 * @return
	 * 返回一个整型的成员信息
	 */
	public int getIdent() {
		return ident;
	}
	/**
	 * 获取并保存一个成员的身份信息
	 * @param ident
	 * 如果成员的身份编号合法，<br>
	 * 则返回成员的身份编号信息
	 */
	public void setIdent(int ident) {
		//判断身份编号是否合法
		if(ident >= 0 &&ident <= 4){
			//如果合法保存身份编号
			this.ident = ident;
		}else{
			//否则默认为普通成员
			this.ident = 0;
		}
	}
}
