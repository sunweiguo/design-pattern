package com.swg.principle.liskov.methodInput;

import java.util.Map;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:17
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Child extends Base{
/*    @Override
    public void hello(HashMap map) {
        System.out.println("child hashmap is running...");
    }*/

    public void hello(Map map){
        System.out.println("child map is running...");
    }
}
