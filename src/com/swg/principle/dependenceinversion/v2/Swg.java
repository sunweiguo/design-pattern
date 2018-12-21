package com.swg.principle.dependenceinversion.v2;

/**
 * @Author 【Swg】.
 * @Date 2018/12/14 20:45
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Swg {

    public void studyCourse(ICourse iCourse) {
        iCourse.study();
    }
}
