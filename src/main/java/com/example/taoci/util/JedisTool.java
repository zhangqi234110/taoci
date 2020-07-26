package com.example.taoci.util;

import redis.clients.jedis.Jedis;

public class JedisTool {

    private static Jedis jedis=new Jedis("localhost");


    public static  Jedis jedisset(){

        return jedis;
    }
}
