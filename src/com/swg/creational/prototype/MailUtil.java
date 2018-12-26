package com.swg.creational.prototype;

import java.text.MessageFormat;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 13:13
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址{1},内容{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，内容为；"+mail.getContent());
    }
}
