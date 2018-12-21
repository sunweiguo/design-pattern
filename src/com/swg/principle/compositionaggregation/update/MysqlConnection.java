package com.swg.principle.compositionaggregation.update;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:53
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class MysqlConnection extends NewDBConnection {
    @Override
    String getConnection() {
        return "Mysql数据库连接...";
    }
}
