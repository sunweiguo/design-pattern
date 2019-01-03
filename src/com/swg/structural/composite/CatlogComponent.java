package com.swg.structural.composite;

/**
 * @Author swg.
 * @Date 2019/1/2 14:05
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public abstract class CatlogComponent {
    public void add(CatlogComponent catlogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatlogComponent catlogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatlogComponent catlogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatlogComponent catlogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
