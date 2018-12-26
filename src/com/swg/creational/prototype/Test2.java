package com.swg.creational.prototype;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:09
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleyton hungrySingleyton = HungrySingleyton.getInstance();
        Method method = hungrySingleyton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleyton cloneHungrySingleyton = (HungrySingleyton) method.invoke(hungrySingleyton);

        System.out.println(hungrySingleyton == cloneHungrySingleyton);
    }
}
