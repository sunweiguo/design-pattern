package com.swg.principle.dependenceinversion.v4;

import com.swg.principle.dependenceinversion.v3.ICourse;

/**
 * @Author 【swg】.
 * @Date 2018/12/14 20:53
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Swg {
    private com.swg.principle.dependenceinversion.v3.ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }
}
