package com.swg.principle.dependenceinversion.v2;

/**
 * @Author 【Swg】.
 * @Date 2018/12/14 20:46
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Swg is stydying java...");
    }
}
