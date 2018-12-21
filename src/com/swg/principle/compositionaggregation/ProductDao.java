package com.swg.principle.compositionaggregation;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:52
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class ProductDao extends DBConnection{
    public void addProduct(){
        String conn = super.getConnection();
        System.out.println("获取"+conn);
    }
}
