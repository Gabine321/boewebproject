package com.boedq.common.xss;

import org.apache.commons.lang.StringUtils;

import com.boedq.common.exception.RRException;


public class SQLFilter {

    
    public static String sqlInject(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");

        
        str = str.toLowerCase();

        
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alert", "drop"};

        
        for(String keyword : keywords){
            if(str.indexOf(keyword) != -1){
                throw new RRException("包含非法字符");
            }
        }

        return str;
    }
}
