package com.study.web.dao;

import java.util.List;

import com.study.web.entity.PersionLogin;
/**
 * PersionLiginDao接口用于实现成员的登录功能，<br>
 * 注册功能，与后台对用户的删除或者修改管理功能<br>
 * @version 1.0
 * @author 刘俊沣
 *
 */
public interface PersionLoginDao {
	/**
	 * 用于查询所有成员的登录数据
	 * @return
	 * 返回至少一个成员的数据集合
	 */
	List<PersionLogin> queryPersionLoginData();
	/**
	 * 通过查找成员的标识号和成员的密码检测是否能正确登录
	 * @param userid
	 * 标识号数据类型为int型
	 * @param password
	 * 密码对应的为字符串类型参数
	 * @return
	 * 如果查询的结果集存在，返回true，<br>
	 * 否则返回false
	 */
	boolean queryPersionLogin(int userid,String password);
	/**
	 * 通过外键查询成员信息，<br>
	 * 主要用于查看用户是否合法登录
	 * @param persionid
	 * 传入整型的成员编号
	 * @param login
	 * 传入所有获取的成员登录表中的信息
	 * @return
	 * 如果合法，返回的值为1
	 */
	int addPersionLogin(int persionid,PersionLogin login);
	/**
	 * 
	 * @param password
	 * @return
	 */
	int updatePassword(String password);
	
	int deletePersionLoginData(PersionLogin persionLogin);
	int deletePersionLoginById(int persionid);
}
