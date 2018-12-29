package com.swg.structural.facade;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:46
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class QualifyService {
    public boolean isAvaliable(PontsGift pontsGift){
        System.out.println("校验"+pontsGift.getName()+"，积分资格通过，库存通过");
        return true;
    }
}
