package com.swg.creational.singleton;

/**
 * @Author 【swg】.
 * @Date 2018/12/25 13:44
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
