package com.study.web.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Լ��������
 * @author ������
 * @version 1.0
 *
 */
public class CheckUtil {
//	private String[] qqNums=new String[5];
	/**
	 * ��̬����<br>
	 * �ж��Ƿ�Ϊ�绰����<br>
	 * @param str
	 * �������
	 * @return
	 * ����ֵΪ��������
	 * @throws PatternSyntaxException
	 * �׳��ж��쳣
	 */
	public static boolean isChinaPhoneLegal(String str) throws PatternSyntaxException {  
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";  
        Pattern p = Pattern.compile(regExp);  
        Matcher m = p.matcher(str);  
        return m.matches();
    }
	
    
    /*
     * ����ַ���������У��QQ����ĺϷ��� 
     */
	/**
	 * ͨ���ַ����ж�QQ�����Ƿ�Ϸ�
	 * @param qqNum
	 * @return
	 */
    public static String checkQQ(String qqNum){  
        String message = null;
        char[] chArr;
        boolean flag=true;  
        if(qqNum.length()>=6&&qqNum.length()<=10){  
            chArr=qqNum.toCharArray();  
            for(char ch:chArr){
                //������ַǷ��ַ�����flag��Ϊflase���˳�ѭ��  
                //if(!(ch>=0&&ch<=9)){//!!!Error,��仰�Ǵ���ģ�����  
                if(!(ch>='0'&&ch<='9')){//���ʣ��ò��ü������أ�!����������ȼ���Σ��������Ż᲻��Ӱ��Ч���أ���  
                    flag=false;  
                    break;  
                }  
            }  
            if(flag){
                if(!qqNum.startsWith("0")){
                    message=qqNum+"��QQ����Ϸ�";
                }else{  
                    message=qqNum+"��QQ�������㿪ͷ���Ϸ�";
                }
            }else{
                message=qqNum+"��QQ�����зǷ��ַ����Ϸ�";
            }
        }else{
            message=qqNum+"��QQ�����������̲��Ϸ�";
        }  
        return message;
    }
    
}
