package com.study.web.dao;

import java.util.List;

import com.study.web.entity.SubjectParent;

/**
 * SubjectsParentsDao用于操作科目所在的系别
 * @version 1.0
 * @author 刘俊沣
 *
 */
public interface SubjectsParentDao {
	/**
	 * 用于查询所有的系别
	 * @return
	 * 返回所有系别的信息
	 */
	List<SubjectParent> querySubjectParent();
	/**
	 * 通过系别id查询系别
	 * @param id
	 * 系别的id编号
	 * @return
	 * 返回符合条件的集合
	 */
	List<SubjectParent> querySubjectParentById(int id);
	/**
	 * 通过系别的名称查询系别
	 * @param name
	 * 系别的名称
	 * @return
	 * 返回符合条件的集合
	 */
	List<SubjectParent> querySubjectParentByName(String name);
	/**
	 * 添加一个系别
	 * @param subjectParent
	 * 传入一个系别的实体类信息
	 * @return
	 * 返回执行的行数
	 */
	int addSubjectParent(SubjectParent subjectParent);
	/**
	 * 
	 * @param subjectParent
	 * 
	 * @return
	 * 
	 */
	int updateSubjectParent(SubjectParent subjectParent);
	/**
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 */
	int deleteSubjectParentById(int id);
	/**
	 * 
	 * @param name
	 * 
	 * @return
	 * 
	 */
	int deleteSubjectParentByName(String name);
}
