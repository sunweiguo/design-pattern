package com.swg.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author swg.
 * @Date 2019/1/2 14:08
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class CourseCatlog extends CatlogComponent{
    private List<CatlogComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CourseCatlog(String name,Integer level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatlogComponent catlogComponent) {
        items.add(catlogComponent);
    }

    @Override
    public void remove(CatlogComponent catlogComponent) {
        items.remove(catlogComponent);
    }

    @Override
    public String getName(CatlogComponent catlogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CatlogComponent item:items){
            if(this.level != null){
                for (int i=0;i<this.level;i++){
                    System.out.print("--");
                }
            }
            item.print();
        }
    }
}
