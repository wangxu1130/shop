package com.fh.api.admin.util;

import redis.clients.jedis.Jedis;

public class RedisUtil {

    public static void main(String[] args) {
        //存入redis
        RedisUtil.set("1111","521120");
        //设置过期时间
        RedisUtil.expire("1111",120);
    }

    public static boolean setNexExpire(String key,String value,int seconds){
        Jedis jedis = null;
        try {
            jedis = RedisPool.getResource();
            Long setnx = jedis.setnx(key, value);
            if (setnx == 1){
                jedis.expire(key, seconds);
                return true;
            }else {
                return false;
            }

        } finally {
            if (null != jedis){
                jedis.close();
                jedis=null;
            }
        }

    }

    public static void set(String key,String value){
        Jedis jedis = null;
        try {
            jedis = RedisPool.getResource();
            jedis.set(key, value);
        } finally {
            if (null != jedis){
                jedis.close();
                jedis=null;
            }
        }

    }

    public static void expire(String key,int seconds){
        Jedis jedis = null;
        try {
            jedis = RedisPool.getResource();
            jedis.expire(key, seconds);
        } finally {
            if (null != jedis){
                jedis.close();
                jedis=null;
            }
        }

    }

    public static String get(String key){
        Jedis jedis = null;
        String result = "";
        try {
            jedis = RedisPool.getResource();
            result = jedis.get(key);
        } finally {
            if (null != jedis){
                jedis.close();
                jedis=null;
            }
        }
        return result;
    }

}
