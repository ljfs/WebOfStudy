package com.study.web.basedao;

public interface BaseDao {
	/**
	 * 删除所有行
	 * @return
	 */
	int deleteAll();
	/**
	 * 查找表中列的行数
	 * @return 返回行数总和
	 */
	int countColumn();
}
