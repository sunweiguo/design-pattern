package com.swg.principle.dependenceinversion.v3;

/**
 * @Author 【swg】.
 * @Date 2018/12/14 20:53
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Swg {
    private ICourse iCourse;
    public Swg(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }
}
