package com.swg.structural.decorator.v2;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:32
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+",花了"+aBattercake.cost());

    }
}
