package com.swg.principle.compositionaggregation.update;

import com.swg.principle.compositionaggregation.DBConnection;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:52
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class NewProductDao extends DBConnection {
    private NewDBConnection dbConnection;

    public void setDbConnection(NewDBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("获取"+conn);
    }
}
