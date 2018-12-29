package com.swg.structural.facade;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:51
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        PontsGift pontsGift = new PontsGift("笔记本电脑");
        GiftExchangeService gifyExchangeService = new GiftExchangeService();
        gifyExchangeService.giftExchage(pontsGift);
    }
}
