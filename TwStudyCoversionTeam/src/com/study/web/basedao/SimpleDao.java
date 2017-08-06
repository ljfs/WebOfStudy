package com.study.web.basedao;

import java.util.List;

public interface SimpleDao<T> extends BaseDao {
	/**
	 * 通过id获取对象信息
	 * @param id 整型数字
	 * @return 返回实体类
	 */
	T getId(int id);
	/**
	 * 通过实体类查找对象
	 * @param entity 实体类
	 * @return 实体类组成的集合
	 */
	List<T> findList(T entity);
	/**
	 * 无条件查找数据表中的集合
	 * @return 返回集合
	 */
	List<T> findAllList();
	/**
	 * 获取一个实体类
	 * @param entity
	 * @return
	 */
	T get(T entity);
	/**
	 * 通过id查找集合
	 * @param id 实体类的id
	 * @return 返回一个集合
	 */
	List<T> findListById(int id);
	/**
	 * 通过名称获取集合
	 * @param name 实体类的实体名称
	 * @return 返回一个集合
	 */
	List<T> findIdByName(String name);
	/**
	 * 添加一个实体类
	 * @param entity 传入实体参数
	 * @return 返回添加的行数
	 */
	int insert(T entity);
	/**
	 * 更新一个实体类
	 * @param entity 传入实体类
	 * @return 返回更新行数
	 */
	int update(T entity);
	/**
	 * 通过id删除实体类
	 * @param id 实体类编号
	 * @return 返回删除的行数
	 */
	int deleteById(int id);
	/**
	 * 根据实体类删除信息
	 * @param entity
	 * @return 返回执行行数
	 */
	int deleteByEntity(T entity);
	/**
	 * 通过id逻辑删除实体类信息
	 * @param id 实体类编号
	 * @return 返回“删除”的行数
	 */
	int heddenEntityById(int id);
}
