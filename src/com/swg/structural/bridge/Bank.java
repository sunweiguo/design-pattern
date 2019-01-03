package com.swg.structural.bridge;

/**
 * @Author swg.
 * @Date 2019/1/3 14:46
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public abstract class Bank {
    protected Acount acount;
    public Bank(Acount acount){
        this.acount = acount;
    }

    abstract Acount openAcount();
}
