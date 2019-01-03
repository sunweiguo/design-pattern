package com.swg.structural.bridge;

/**
 * @Author swg.
 * @Date 2019/1/3 14:48
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class ICBCBank extends Bank{
    public ICBCBank(Acount acount) {
        super(acount);
    }

    @Override
    Acount openAcount() {
        System.out.println("打开中国工商银行账号");
        acount.openAcount();
        return acount;
    }
}
