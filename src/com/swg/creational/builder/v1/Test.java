package com.swg.creational.builder.v1;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 21:03
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBulder().buildCourseName("name").buildCourseArticle("article")
                            .buildCoursePPT("ppt").buildCourseQA("QA").buildCoursVideo("vedio")
                            .makeCourse();
        System.out.println(course);
    }
}
