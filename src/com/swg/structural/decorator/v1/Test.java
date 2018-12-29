package com.swg.structural.decorator.v1;

/**
 * @Author 【swg】.
 * @Date 2018/12/28 14:08
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        //煎饼啥都不加
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+",花了"+battercake.cost());
        //加一个鸡蛋
        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+",花了"+battercakeWithEgg.cost());
        //加一个鸡蛋，再加一个火腿肠
        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+",花了"+battercakeWithEggSausage.cost());
    }
}
