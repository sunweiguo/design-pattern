package com.swg.structural.decorator.v1;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:07
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    protected String getDesc() {
        return super.getDesc()+"，再加根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
