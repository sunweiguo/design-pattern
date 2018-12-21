package com.swg.principle.openclose;

/**
 * @Author 【Swg】.
 * @Date 2018/12/13 15:23
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class DiscountJavaCourse extends JavaCourse{
    public DiscountJavaCourse(int id, String name, double price) {
        super(id, name, price);
    }

    public double getDiscountPrice(){
        return super.getPrice()*0.8;
    }
}
