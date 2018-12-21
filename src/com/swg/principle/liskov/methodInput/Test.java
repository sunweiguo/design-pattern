package com.swg.principle.liskov.methodInput;

import java.util.HashMap;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:18
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap map = new HashMap();
        child.hello(map);
    }
}
