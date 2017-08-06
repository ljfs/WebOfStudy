package com.study.web.mysql.dao;

import java.util.List;

import com.study.web.annotation.MyBatisDao;
import com.study.web.basedao.SimpleDao;
import com.study.web.entity.Persion;

@MyBatisDao
public interface PersionDao extends SimpleDao<Persion> {
	/**
	 * 接口抽象方法用于无条件查找全部的成员信息
	 * @return
	 * 该接口返回一个成员的信息集合用于保存成员信息
	 */
	List<Persion> queryAllPersion();
	/**
	 * 接口抽象方法用于通过成员的姓名查找成员信息
	 * @param name
	 * 传入参数为姓名，类型为字符串
	 * @return
	 * 返回一个包含有成员信息的集合
	 */
	List<Persion> queryPersionByName(String name);
	/**
	 * 接口抽象方法用于通过成员的信誉度查找成员信息
	 * @param requation
	 * 传入参数为成员的信誉度
	 * @return
	 * 返回符合条件的成员集合
	 */
	List<Persion> queryPersionByRequtation(int requation);
	/**
	 * 接口抽象方法通过成员所在的地区查询成员信息
	 * @param provlice
	 * 传入的第一个参数为成员所在省份
	 * @param city
	 * 传入的第二个参数为成员所在的城市
	 * @return
	 * 返回所有符合查询条件的成员集合
	 */
	List<Persion> queryPersionByArear(String provlice,String city);
	/**
	 * 接口抽象方法通过成员的性别查询成员信息
	 * @param gender
	 * 传入参数为性别
	 * @return
	 * 返回所有符合查询条件的的成员集合
	 */
	List<Persion> queryPersionBySex(String gender);
	/**
	 * 接口抽象方法通过初始编号查询一名成员的信息
	 * @param id
	 * 传入参数为成员的编号
	 * 仅允许底层管理员使用
	 * @return
	 * 返回一个成员的信息
	 */
	List<Persion> queryPersionById(int id);
	/**
	 * 接口抽象方法通过手机号查询成员信息
	 * @param moblePhone
	 * 传入的参数为手机号组成的字符串
	 * @return
	 * 返回一名成员的信息
	 */
	List<Persion> queryPersionByPhone(String moblePhone);
	/**
	 * 接口抽象方法通过年龄的上下限查找成员的信息
	 * @param minAge
	 * 年龄的下限
	 * @param maxAge
	 * 年龄的上限
	 * @return
	 * 返回所有符合条件的成员的信息
	 */
	List<Persion> queryPersionByAge(int minAge,int maxAge);
	/**
	 * 接口抽象方法用于添加注册成员的信息
	 * @param persionlist
	 * 传入的参数为一个成员信息的集合，如果该成员不存在，则保存成员的信息
	 * @return
	 * 返回结果如果为1则注册成功，否则注册失败
	 */
	int addPersion(List<Persion> persionlist);
	/**
	 * 接口抽象方法通过成员的初始编号删除成员
	 * @param id
	 * 传入参数为成员的编号，该抽象方法仅限底层管理成员使用
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletepersionById(int id);
	/**
	 * 接口抽象方法通过成员的姓名来删除成员的信息
	 * @param name
	 * 传入的参数为成员的姓名
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletePersionByName(String name);
	/**
	 * 接口抽象方法通过成员的性别删除成员信息
	 * @param gender
	 * 传入参数为承运的性别，该抽象方法仅限底层管理成员使用
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletePersionBySex(String gender);
	/**
	 * 接口抽象方法通过成员的信誉度删除成员信息
	 * @param reputation
	 * 传入参数为成员的信誉度
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletePersionByReputation(int reputation);
	/**
	 * 通过成员所在的区域进行删除成员信息，该抽象方法仅限底层管理成员使用
	 * @param privince
	 * 传入参数为成员的省份
	 * @param city
	 * 传入参数为成员的所在城市
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletePersionByArea(String province,String city);
	/**
	 * 接口抽象方法通过成员的手机号删除成员信息
	 * @param moblePhone
	 * 传入参数为成员的手机号
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletePersionByPhone(String moblePhone);
	/**
	 * 通过年龄的区域筛选并删除成员信息，该抽象方法仅限底层管理成员使用
	 * @param minAge
	 * 传入蟾酥为成员的年龄的下限
	 * @param maxAge
	 * 传入的参数为成员的年龄的上限
	 * @return
	 * 如果返回值为1表示删除成功，返回值为0表示没有找到删除的对象，返回值为-1表示删除失败
	 */
	int deletePersionByAge(int minAge,int maxAge);
	/**
	 * 接口抽象方法通过传入一组成员信息的集合修改
	 * @param persionList
	 * 该参数为一个泛型集合，集合的泛型约束为成员类
	 * @return
	 * 如果返回值为1表示更新成功
	 */
	int executeUpdate(List<Persion> persionList);
	/**
	 * 接口抽象方法通过id编号更新成员的信息
	 * @param id
	 * 传入参数为成员的编号，该抽象方法仅限底层管理成员使用
	 * @return
	 * 如果返回值为1表示更新成功
	 */
	int queryAndUpdateReputationById(int id);
	/**
	 * 接口抽象方法通过查找成员的姓名更新成员信息
	 * @param name
	 * 传入参数为成员的姓名
	 * @return
	 * 如果返回值为1表示更新成功
	 */
	int queryAndUpdateReputationByName(String name);
	/**
	 * 接口抽象方法通过QQ号对成员的信息进行修改
	 * @param qq
	 * 传入参数为成员的qq
	 * @return
	 * 如果返回值为1表示更新成功
	 */
	int queryAndUpdateReputationByQId(String qq);
	/**
	 * 查询所有学生的总数
	 * @return
	 */
	int countPersion();
	/**
	 * 分页查询
	 * @param columns 行数
	 * @param page 页数
	 * @return 返回集合
	 */
	List<Persion> queryPersonByPage(int columns,int page);
}