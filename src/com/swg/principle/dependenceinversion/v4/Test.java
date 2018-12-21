package com.swg.principle.dependenceinversion.v4;

import com.swg.principle.dependenceinversion.v3.FECourse;
import com.swg.principle.dependenceinversion.v3.JavaCourse;

/**
 * @Author 【swg】.
 * @Date 2018/12/14 20:58
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Swg swg  = new Swg();
        swg.setiCourse(new JavaCourse());
        swg.study();
        swg.setiCourse(new FECourse());
        swg.study();
    }
}
