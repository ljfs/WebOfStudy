package com.study.web.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 约束工具类
 * @author 刘俊沣
 * @version 1.0
 *
 */
public class CheckUtil {
//	private String[] qqNums=new String[5];
	/**
	 * 静态方法<br>
	 * 判断是否为电话号码<br>
	 * @param str
	 * 传入参数
	 * @return
	 * 返回值为布尔类型
	 * @throws PatternSyntaxException
	 * 抛出判断异常
	 */
	public static boolean isChinaPhoneLegal(String str) throws PatternSyntaxException {  
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";  
        Pattern p = Pattern.compile(regExp);  
        Matcher m = p.matcher(str);  
        return m.matches();
    }
	
    
    /*
     * 组合字符串方法来校验QQ号码的合法性 
     */
	/**
	 * 通过字符串判断QQ号码是否合法
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
                //如果发现非法字符，则将flag置为flase，退出循环  
                //if(!(ch>=0&&ch<=9)){//!!!Error,这句话是错误的！！！  
                if(!(ch>='0'&&ch<='9')){//疑问：用不用加括号呢？!运算符的优先级如何？？加括号会不会影响效率呢？？  
                    flag=false;  
                    break;  
                }  
            }  
            if(flag){
                if(!qqNum.startsWith("0")){
                    message=qqNum+"：QQ号码合法";
                }else{  
                    message=qqNum+"：QQ号码以零开头不合法";
                }
            }else{
                message=qqNum+"：QQ号码有非法字符不合法";
            }
        }else{
            message=qqNum+"：QQ号码过长或过短不合法";
        }  
        return message;
    }
    
}
