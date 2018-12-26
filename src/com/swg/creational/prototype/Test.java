package com.swg.creational.prototype;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 13:16
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i=0;i<10;i++){
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("名字_"+i);
            mailTmp.setAddress("姓名_"+i+"@mail,com");
            mailTmp.setContent("恭喜你中奖了");
            MailUtil.sendMail(mailTmp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
