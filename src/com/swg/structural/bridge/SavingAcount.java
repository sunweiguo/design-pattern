package com.swg.structural.bridge;

/**
 * @Author swg.
 * @Date 2019/1/3 14:45
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class SavingAcount implements Acount{
    @Override
    public Acount openAcount() {
        System.out.println("打开活期账号");
        return new SavingAcount();
    }

    @Override
    public void showAcountType() {
        System.out.println("这是一个活期账号");
    }
}
