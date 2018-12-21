package com.swg.principle.compositionaggregation.update;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:53
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class OracleConnection extends NewDBConnection {
    @Override
    String getConnection() {
        return "Oracle数据库连接...";
    }
}
