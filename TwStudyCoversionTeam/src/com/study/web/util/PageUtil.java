package com.study.web.util;

/**
 * 分页查询工具
 * @author 刘俊沣
 * @version 1.0
 * 
 */
public class PageUtil {
	/**
	 * 分页查询功能以及简易算法
	 * @param totalCount
	 * 获取信息的总行数
	 * @param pageSize
	 * 获取分页时每一页的信息行数
	 * @return
	 * 返回一个分页后的页数<br>
	 */
	public static int countTotalPages(int totalCount,int pageSize){
		//通过三元运算符运算并判断页数
		return totalCount % pageSize == 0? totalCount/pageSize:totalCount/pageSize +1;
	}
}
