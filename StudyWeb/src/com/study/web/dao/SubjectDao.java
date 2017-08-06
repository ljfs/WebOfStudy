package com.study.web.dao;

import java.util.List;

import com.study.web.entity.Subjects;
/**
 * SubjectDao用于管理学习科目
 * @version 1.0
 * @author 刘俊沣
 *
 */
public interface SubjectDao {
	/**
	 * 用于查询所有的学科信息
	 * @return
	 * 反回一个或多个集合包含科目
	 */
	List<Subjects> querySubjects();
	/**
	 * 通过Id编号查询学科信息
	 * @param id
	 * 传入的id参数为科目的id编号<br>
	 * 通过id编号直接查询科目
	 * @return
	 * 返回最多一个集合
	 */
	List<Subjects> querySubjectById(int id);
	/**
	 * 通过科目的系别查询科目
	 * @param parent
	 * 传入的参数为科目系别的实体类，<br>
	 * 其中包括最多一个科目的系别，<br>
	 * 但是系别中可能包含了个科目
	 * @return
	 * 返回所有符合条件的集合
	 */
	List<Subjects> querySubjectByParent(String parent);
	/**
	 * 通过科目的系别查询科目
	 * @param pid
	 * 传入的参数为科目系别的编号，<br>
	 * 其中包括最多一个科目的系别，<br>
	 * 但是系别中可能包含了个科目
	 * @return
	 * 返回所有符合条件的集合
	 */
	List<Subjects> querySubjectByParentId(int pid);
	/**
	 * 通过科目的名称查询科目信息
	 * @param name
	 * 传入参数为科目的名称
	 * @return
	 * 返回符合条件的集合
	 */
	List<Subjects> querySubjectByName(String name);
	/**
	 * 添加学科信息
	 * @param subjects
	 * 学科信息类
	 * @return
	 * 返回执行成功的行数
	 */
	int addSubject(Subjects subjects);
	/**
	 * 通过科目编号删除科目
	 * @param id
	 * 科目编号
	 * @return
	 * 返回执行成功的行数
	 */
	int deleteSubjectById(int id);
	/**
	 * 通过科目名称删除科目
	 * @param name
	 * 科目的名称
	 * @return
	 * 返回执行的行数
	 */
	int deleteSubjectByName(String name);
	/**
	 * 通过科目的系别编号删除科目
	 * @param pid
	 * 科目的系别编号
	 * @return
	 * 返回执行的行数
	 */
	int deleteSubjectByParent(int pid);
	/**
	 * 更新科目信息
	 * @param subjects
	 * 传入科目的实体类信息
	 * @return
	 * 返回执行成功的行数
	 */
	int updateSubject(Subjects subjects);
}