package com.swg.structural.flyweight;

/**
 * @Author swg.
 * @Date 2018/12/31 23:26
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class Test {
    private static final String depatments[] = {"ED","QA","PM"};

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            String department = depatments[(int)(Math.random() * depatments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
            Integer a = Integer.valueOf(1);
        }
    }
}
