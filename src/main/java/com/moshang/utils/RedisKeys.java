package com.moshang.utils;

/**
 * Redis所有Keys
 *
 * @author moshang
 * @date 2017年08月02日
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
