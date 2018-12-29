package com.swg.structural.facade;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:47
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class PointsPaymentService {
    public boolean pay(PontsGift pontsGift){
        System.out.println("支付："+pontsGift.getName()+"成功");
        return true;
    }
}
