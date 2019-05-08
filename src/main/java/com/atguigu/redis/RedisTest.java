package com.atguigu.redis;

import redis.clients.jedis.Jedis;

/**
 * @author shkstart
 * @create 2019-04-22 18:28
 */
public class RedisTest {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("127.0.0.1",6379);

        jedis.auth("821721");

        System.out.println("Conntect to server successfully");

        System.out.println("server is running"+jedis.ping());

        /*String key1 = jedis.get("key1");

        System.out.println(key1);*/

        //jedis.set("redis","redis");

        byte[] bytes = jedis.get("list1".getBytes());
        


    }


}
