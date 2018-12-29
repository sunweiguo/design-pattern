package com.swg.structural.decorator.v2;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:31
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
