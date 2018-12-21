package com.swg.creational.factorymethod;

/**
 * @Author 【swg】.
 * @Date 2018/12/19 19:10
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class JavaVeidoFactory extends VideoProduceFactory{
    @Override
    public Video getVideo(String type) {
        return new JavaVideo();
    }
}
