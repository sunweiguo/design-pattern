package com.swg.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/12/15 13:45
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class TeamLeader {
    public void getCourseNumber() {
        List<Course> courses = new ArrayList<>();
        for(int i=0;i<20;i++){
            courses.add(new Course());
        }
        System.out.println(courses.size());
    }
}
