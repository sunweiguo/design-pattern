package com.swg.structural.bridge;

/**
 * @Author swg.
 * @Date 2019/1/3 14:49
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class ABCBank extends Bank{
    public ABCBank(Acount acount) {
        super(acount);
    }

    @Override
    Acount openAcount() {
        System.out.println("打开中国农业银行账号");
        acount.openAcount();
        return acount;
    }
}
