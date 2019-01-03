package com.swg.structural.bridge;

/**
 * @Author swg.
 * @Date 2019/1/3 14:44
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class DepositAcount implements Acount{
    @Override
    public Acount openAcount() {
        System.out.println("打开定期账号");
        return new DepositAcount();
    }

    @Override
    public void showAcountType() {
        System.out.println("这是一个定期账号");
    }
}
