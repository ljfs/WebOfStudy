package com.study.web.util;

/**
 * ��ҳ��ѯ����
 * @author ������
 * @version 1.0
 * 
 */
public class PageUtil {
	/**
	 * ��ҳ��ѯ�����Լ������㷨
	 * @param totalCount
	 * ��ȡ��Ϣ��������
	 * @param pageSize
	 * ��ȡ��ҳʱÿһҳ����Ϣ����
	 * @return
	 * ����һ����ҳ���ҳ��<br>
	 */
	public static int countTotalPages(int totalCount,int pageSize){
		//ͨ����Ԫ��������㲢�ж�ҳ��
		return totalCount % pageSize == 0? totalCount/pageSize:totalCount/pageSize +1;
	}
}
