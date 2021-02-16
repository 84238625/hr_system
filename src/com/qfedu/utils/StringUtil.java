package com.qfedu.utils;
/*将Null转为空字符串*/
public class StringUtil {
    public static String notNull(String s){
        if(s==null||s.length()<1)
            return "";
        return s;
    }

}
