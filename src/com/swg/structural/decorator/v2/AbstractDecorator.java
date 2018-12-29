package com.swg.structural.decorator.v2;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:24
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
