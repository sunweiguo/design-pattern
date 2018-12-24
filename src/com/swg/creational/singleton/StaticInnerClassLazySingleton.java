package com.swg.creational.singleton;

/**
 * @Author 【swg】.
 * @Date 2018/12/24 13:09
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class StaticInnerClassLazySingleton {

    private StaticInnerClassLazySingleton(){}

    private static class InnerClass {
        private static StaticInnerClassLazySingleton instance = new StaticInnerClassLazySingleton();
    }

    public static StaticInnerClassLazySingleton getInstance(){
        return InnerClass.instance;
    }

}
