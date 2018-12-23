package com.swg.creational.builder;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 19:21
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVedio(String courseVedio);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
