package com.swg.principle.openclose;

/**
 * @Author 【Swg】.
 * @Date 2018/12/13 15:16
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class JavaCourse implements ICourse{
    private int id;
    private String name;
    private double price;

    public JavaCourse() {
    }

    public JavaCourse(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
