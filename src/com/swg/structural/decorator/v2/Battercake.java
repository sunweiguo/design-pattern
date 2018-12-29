package com.swg.structural.decorator.v2;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:23
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
