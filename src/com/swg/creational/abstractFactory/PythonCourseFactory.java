package com.swg.creational.abstractFactory;

/**
 * @Author 【swg】.
 * @Date 2018/12/21 22:55
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Vedio getVedio() {
        return new PythonVedio();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
