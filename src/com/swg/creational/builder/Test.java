package com.swg.creational.builder;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 20:17
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("电商项目","PPT","视频","文章","QA");
        System.out.println(course);
    }

}
