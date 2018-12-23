package com.swg.creational.builder;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 19:26
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,
                             String couesePPT,
                             String courseVedio,
                             String courseArticle,
                             String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(couesePPT);
        this.courseBuilder.buildCourseVedio(courseVedio);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
