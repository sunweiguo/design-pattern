package com.swg.principle.compositionaggregation.update;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:56
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        NewProductDao productDao = new NewProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();
    }
}
