package com.swg.principle.liskov;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:03
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("宽度为："+rectangle.getWidth()+",长度为:"+rectangle.getLength());
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
}
