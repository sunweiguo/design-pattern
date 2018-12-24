package com.swg.creational.singleton;

/**
 * @Author 【swg】.
 * @Date 2018/12/24 13:09
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance = null;
    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
