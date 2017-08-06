package com.study.web.mysql.dao;

import java.awt.geom.Area;
import java.util.List;

import com.study.web.annotation.MyBatisDao;
import com.study.web.basedao.SimpleDao;
import com.study.web.entity.City;
import com.study.web.entity.Province;

/**
 * AreaDao接口中的抽象方法对地区信息进行增删改查，<br>
 * 仅仅在为底层管理员使用，普通管理员和普通成员只能进行查询和获取id<br>
 * @version 1.0
 * @author 刘俊沣
 *
 */
@MyBatisDao
public interface ArearDao extends SimpleDao<Area> {
	/**
	 * 抽象方法执行全部查询<br>
	 * 查询对应的数据表为地区（省份）
	 * @return
	 * 返回一组含有省份，编号的集合
	 */
	List<Province> queryProvice();
	/**
	 * 抽象方法用于查询所有的省份<br>
	 * 查询时需要传入参数<br>
	 * @param id
	 * id编号对应数据表中城市的编号<br>
	 * @return
	 * 返回一组集合
	 */
	List<Province> queryProvinceById(Province id);
	/**
	 * 抽象方法通过传入省份的信息直接查询省份<br>
	 * 用于返回一个省份的集合<br>
	 * @param province
	 * 传入的参数为省份的名字组成的字符串
	 * @return
	 * 返回一个省份的集合（主要用于获取省份的id）
	 */
	List<Province> queryProvinceByName(String province);
	/**
	 * 查询全部的城市信息
	 * @return
	 * 返回一个关于城市信息的集合
	 */
	List<City> queryCity();
	/**
	 * 通过城市所在的省份编号查询外键连接的城市以及所选省份的信息<br>
	 * 查找出一个省份中包含的城市集合<br>
	 * @param id
	 * 传入的id参数对应数据库中城市表的省份id编号，<br>
	 * 通过建立外键关系获取省份表中的省份id<br>
	 * @return
	 * 返回所传入省份的城市信息集合
	 */
	List<City> queryCityByProvinceId(City id);
	/**
	 * 通过城市的id查找城市<br>
	 * 对城市进行精确查找<br>
	 * @param id
	 * 传入的参数对应数据表中的id列<br>
	 * id列的约束为非空，自增1，唯一<br>
	 * @return
	 * 返回一个集合，主要包含城市的信息(单表查询)
	 */
	List<City> queryCityById(City id);
	/**
	 * 对于城市按照城市的名称进行查询<br>
	 * 查询之后直接获取城市的信息<br>
	 * @param city
	 * 传入参数为城市名称，<br>
	 * 类型为字符串<br>
	 * @return
	 * 返回一个城市的集合
	 */
	List<City> queryCityByName(String city);
	/**
	 * 通过传入一个省份的所有参数添加省份<br>
	 * @param province
	 * 传入的参数为省份的实体
	 * @return
	 * 返回一个整型数字，如果为1表示添加成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int addProvince(Province province);
	/**
	 * 通过传入一个城市的所有参数添加城市<br>
	 * @param city
	 * 传入一个城市的实体类
	 * @return
	 * 返回一个整型数字，如果为1表示添加成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int addCity(City city);
	/**
	 * 修改省份信息，用于对应国家政治的变动
	 * @param province
	 * 传入一个省份的类
	 * @return
	 * 返回一个整型数字，如果为1表示修改成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int updateProvince(Province province);
	/**
	 * 传入一个城市的值，用于修改城市
	 * @param city
	 * 传入一个城市的实体类 
	 * @return
	 * 返回一个整型数字，如果为1表示修改成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int updateCity(City city);
	/**
	 * 通过省份的名称对省份进行删除<br>
	 * @param province
	 * 传入的参数为省份名称，<br>
	 * 形参的命名与上面城市的命名相同，<br>
	 * 但不属于同一种参数，该参数为字符串类型参数
	 * @return
	 * 返回一个整型数字，如果为1表示删除成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int deleteProvinceByName(String province);
	/**
	 * 通过省份的id删除省份<br>
	 * @param id
	 * 传入一个省份的id编号<br>
	 * @return
	 * 返回一个整型数字，如果为1表示删除成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int deleteProvinceById(Province id);
	/**
	 * 通过城市的id删除城市
	 * @param id
	 * 传入一个城市的id编号
	 * @return
	 * 返回一个整型数字，如果为1表示删除成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int deleteCityById(int id);
	/**
	 * 通过城市的名称直接删除城市
	 * @param city
	 * 传入城市的名称
	 * @return
	 * 返回一个整型数字，如果为1表示删除成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int deleteCityByName(String city);
	/**
	 * 通过查询城市表外键对应的省份批量删除城市信息
	 * @param id
	 * 传入省份的id编号
	 * @return
	 * 返回一个整型数字，如果为1表示删除成功，<br>
	 * 如果为0表示添加失败，数据表中已有省份，<br>
	 * 返回之前先设置返回数目初始值为-1
	 */
	int deleteCityByProvinceId(int id);
}
