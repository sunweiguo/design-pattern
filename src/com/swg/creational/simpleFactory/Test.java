package com.swg.creational.simpleFactory;

/**
 * @Author 【swg】.
 * @Date 2018/12/17 21:04
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Test {
    public static void main(String[] args) {
//        VideoProduceFactory factory = new VideoProduceFactory();
//        Video video = factory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        VideoProduceFactory factory = new VideoProduceFactory();
        Video video = factory.getVideoByClass(PythonVideo.class);
        video.produce();
    }
}
