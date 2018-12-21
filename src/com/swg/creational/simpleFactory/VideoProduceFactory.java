package com.swg.creational.simpleFactory;

/**
 * @Author 【swg】.
 * @Date 2018/12/17 20:40
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class VideoProduceFactory {
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

    public Video getVideoByClass(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
