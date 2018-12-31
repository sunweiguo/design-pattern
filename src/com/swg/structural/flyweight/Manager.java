package com.swg.structural.flyweight;

/**
 * @Author swg.
 * @Date 2018/12/31 23:22
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class Manager implements Employee{
    private String department;
    private String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    Manager(String department){
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
