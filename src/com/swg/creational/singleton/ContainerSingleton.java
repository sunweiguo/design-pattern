package com.swg.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 【swg】.
 * @Date 2018/12/25 14:12
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class ContainerSingleton {
    private static Map<String,Object> map = new HashMap<String,Object>();

    private ContainerSingleton(){

    }

    public static void putInstance(String key,Object instance){
        //判断key不为空，instance也不为空
        if(!map.containsKey(key)){
            map.put(key,instance);
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}
