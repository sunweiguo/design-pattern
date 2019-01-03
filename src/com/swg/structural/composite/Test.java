package com.swg.structural.composite;

/**
 * @Author swg.
 * @Date 2019/1/2 14:11
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class Test {
    public static void main(String[] args) {
        CatlogComponent linuxCourse = new Course("linux课程",11);
        CatlogComponent windowsCourse = new Course("windows课程",12);

        CatlogComponent javaCatlog = new CourseCatlog("java课程",2);

        CatlogComponent snailmall1 = new Course("电商一期",55);
        CatlogComponent snailmall2 = new Course("电商二期",66);
        CatlogComponent snailmall3 = new Course("电商三期",77);

        javaCatlog.add(snailmall1);
        javaCatlog.add(snailmall2);
        javaCatlog.add(snailmall3);


        CatlogComponent immoc = new CourseCatlog("慕课网",1);
        immoc.add(linuxCourse);
        immoc.add(windowsCourse);
        immoc.add(javaCatlog);

        immoc.print();


    }
}
