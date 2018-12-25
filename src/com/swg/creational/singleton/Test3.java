package com.swg.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author 【swg】.
 * @Date 2018/12/25 13:45
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        //序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonFile"));
//        oos.writeObject(instance);
//        //反序列化
//        File file = new File("singletonFile");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        //获取反序列化后的对象
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//        //测试
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());


        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumInstance instance = (EnumInstance) constructor.newInstance("swg",666);
    }
}
