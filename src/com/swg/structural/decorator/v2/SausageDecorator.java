package com.swg.structural.decorator.v2;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:32
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根火腿肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
