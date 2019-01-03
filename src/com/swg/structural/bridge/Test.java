package com.swg.structural.bridge;

/**
 * @Author swg.
 * @Date 2019/1/3 14:53
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAcount());
        Acount icbcAcount = icbcBank.openAcount();
        icbcAcount.showAcountType();

        Bank icbcBank2 = new ICBCBank(new SavingAcount());
        Acount icbcAcount2 = icbcBank2.openAcount();
        icbcAcount2.showAcountType();

        Bank abcBank = new ABCBank(new SavingAcount());
        Acount abcAcount = abcBank.openAcount();
        abcAcount.showAcountType();
    }
}
