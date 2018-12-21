package com.swg.principle.dependenceinversion.v3;

/**
 * @Author 【swg】.
 * @Date 2018/12/14 20:54
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Swg swg = new Swg(new JavaCourse());
        swg.study();
        swg = new Swg(new FECourse());
        swg.study();
    }
}
