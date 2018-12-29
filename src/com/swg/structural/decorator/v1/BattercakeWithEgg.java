package com.swg.structural.decorator.v1;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:02
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getDesc() {
        return super.getDesc()+"，再价格鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
