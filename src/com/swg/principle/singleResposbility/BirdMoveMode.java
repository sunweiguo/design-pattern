package com.swg.principle.singleResposbility;

/**
 * @Author 【swg】.
 * @Date 2018/12/14 21:36
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class BirdMoveMode {
    public void move(String birdName){
        if(birdName.equals("鸵鸟")){
            System.out.println(birdName+"是跑的...");
        }else {
            System.out.println(birdName+"是飞的...");
        }
    }
}
