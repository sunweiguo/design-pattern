package com.swg.creational.singleton;

import java.io.Serializable;

/**
 * @Author 【swg】.
 * @Date 2018/12/24 14:20
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getGetInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
