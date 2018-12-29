package com.swg.structural.adapter;

/**
 * @Author 【swg】.
 * @Date 2018/12/29 14:05
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdaper();
        dc5.outputDC5V();
    }
}
