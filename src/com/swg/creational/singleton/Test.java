package com.swg.creational.singleton;

import java.io.*;

/**
 * @Author 【swg】.
 * @Date 2018/12/24 14:25
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //获取单例对象
        HungrySingleton instance = HungrySingleton.getGetInstance();
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonFile"));
        oos.writeObject(instance);
        //反序列化
        File file = new File("singletonFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //获取反序列化后的对象
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        //测试
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
