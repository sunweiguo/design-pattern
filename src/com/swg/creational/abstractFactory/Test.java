package com.swg.creational.abstractFactory;

/**
 * @Author 【swg】.
 * @Date 2018/12/21 23:10
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        javaCourseFactory.getArticle().produce();
        javaCourseFactory.getVedio().produce();

        pythonCourseFactory.getArticle().produce();
        pythonCourseFactory.getVedio().produce();
    }
}
