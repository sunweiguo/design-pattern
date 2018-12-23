package com.swg.creational.builder;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 19:23
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class CourseActualBuilder extends CourseBuilder{
    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVedio(String courseVedio) {
        course.setCoursVideo(courseVedio);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
