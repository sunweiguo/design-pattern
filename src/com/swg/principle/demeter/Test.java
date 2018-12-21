package com.swg.principle.demeter;

/**
 * @Author 【swg】.
 * @Date 2018/12/15 13:48
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.check(teamLeader);
    }
}
