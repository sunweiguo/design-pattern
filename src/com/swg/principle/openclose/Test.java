package com.swg.principle.openclose;

/**
 * @Author 【Swg】.
 * @Date 2018/12/13 15:17
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(1,"好看的课",200.00);
//        System.out.println("课程id："+javaCourse.getId()+",课程的名称："+javaCourse.getName()+",课程的价格:"+javaCourse.getPrice());

        ICourse iCourse = new DiscountJavaCourse(1,"好看的课",200.00);
        DiscountJavaCourse discountJavaCourse = (DiscountJavaCourse)iCourse;
        System.out.println("课程id："+discountJavaCourse.getId()+",课程的名称："+discountJavaCourse.getName()+",原价:"+discountJavaCourse.getPrice()+",折后价为："+discountJavaCourse.getDiscountPrice());

    }
}
