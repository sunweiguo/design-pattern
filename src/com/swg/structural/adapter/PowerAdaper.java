package com.swg.structural.adapter;

/**
 * @Author 【swg】.
 * @Date 2018/12/29 14:03
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class PowerAdaper implements DC5{
    //使用组合的方式引入被适配的类
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adpterInput = ac220.outputAC22V();

        //将220v的交流电转换为5v的直流电
        int adpterOutput = adpterInput / 44;

        System.out.println("适用电源适配器PowerAdaper，输入为"+adpterInput+"V,输出为"+adpterOutput+"V");
        return adpterOutput;
    }
}
