package com.swg.creational.singleton;

/**
 * @Author 【swg】.
 * @Date 2018/12/24 13:09
 * @DESC 懒汉式单例，存在线程安全问题
 * @CONTACT 317758022@qq.com
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
