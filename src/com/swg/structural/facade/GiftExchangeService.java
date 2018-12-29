package com.swg.structural.facade;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 14:49
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class GiftExchangeService {
    private QualifyService quaifyService = new QualifyService();
    private PointsPaymentService pintsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchage(PontsGift pontsGift){
        if(quaifyService.isAvaliable(pontsGift)){
            if(pintsPaymentService.pay(pontsGift)){
                String shippingOrderNo= shippingService.shipGift(pontsGift);
                System.out.println("物流系统下单成功，订单号为："+shippingOrderNo);
            }
        }
    }
}
