package com.swg.structural.facade;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:48
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class ShippingService {
    public String shipGift(PontsGift pontsGift){
        //对接物流系统
        System.out.println(pontsGift.getName()+"进入物流系统");
        String shippingNo = "6666";
        return shippingNo;
    }
}
