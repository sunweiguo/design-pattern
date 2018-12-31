package com.swg.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author swg.
 * @Date 2018/12/31 23:24
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class EmployeeFactory {
    public static final Map<String,Employee> employeeMap = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) employeeMap.get(department);

        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理："+department);
            String reportContent = department+"部门汇报，汇报内容为：。。。";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);
            employeeMap.put(department,manager);
        }
        return manager;
    }
}
