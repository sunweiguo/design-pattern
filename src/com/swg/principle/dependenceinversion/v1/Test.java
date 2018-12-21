package com.swg.principle.dependenceinversion.v1;

/**
 * @Author 【Swg】.
 * @Date 2018/12/14 20:40
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        StudyCourse studyCourse = new StudyCourse();
        studyCourse.studyJava();
        studyCourse.studyFE();
    }
}
