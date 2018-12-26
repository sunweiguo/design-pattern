package com.swg.creational.prototype;

/**
 * @Author 【swg】.
 * @Date 2018/12/26 13:12
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Mail implements Cloneable{
    private String name;
    private String address;
    private String content;

    public Mail(){
        System.out.println("Mail class construct");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
