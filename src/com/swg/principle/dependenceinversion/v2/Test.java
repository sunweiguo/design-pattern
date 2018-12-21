package com.swg.principle.dependenceinversion.v2;

/**
 * @Author 【Swg】.
 * @Date 2018/12/14 20:47
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Swg swg = new Swg();
        swg.studyCourse(new JavaCourse());
        swg.studyCourse(new FECourse());
    }
}
