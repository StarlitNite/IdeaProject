package com.example.sovo0.util;

import com.example.sovo0.exception.ParamsException;

public class AssertUtil {

    public static void isTrue(Boolean flag,String msg){
        //如果为true（true是错的），则抛出异常
        if (flag){
            throw new ParamsException(msg);
        }
    }
}
