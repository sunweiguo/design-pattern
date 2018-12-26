package com.swg.creational.prototype;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:08
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class HungrySingleyton implements Cloneable{
    private static HungrySingleyton instance = new HungrySingleyton();

    private HungrySingleyton(){}

    public static HungrySingleyton getInstance(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
