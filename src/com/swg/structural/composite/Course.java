package com.swg.structural.composite;

/**
 * @Author swg.
 * @Date 2019/1/2 14:07
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class Course extends CatlogComponent{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatlogComponent catlogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatlogComponent catlogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称："+this.name+",价格为:"+this.price);
    }
}
