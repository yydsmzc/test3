package com.example.myutils;

public class StringUtils {
    private StringUtils(){}
    private static StringUtils stringUtils;
    public static StringUtils getInstance(){
        if(stringUtils == null){
            synchronized (StringUtils.class){
                if(stringUtils == null){
                    stringUtils = new StringUtils();
                }
            }
        }
        return stringUtils;
    }

    //转大写
    public String da(String str){
        return str == null?null:str.toUpperCase();
    }
    //转xiao写
    public String xiao(String str){
        return str == null?null:str.toLowerCase();
    }
}
