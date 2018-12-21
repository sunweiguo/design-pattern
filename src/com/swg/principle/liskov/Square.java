package com.swg.principle.liskov;

/**
 * @Author 【swg】.
 * @Date 2018/12/16 22:02
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Square extends Rectangle{
    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(int width) {
        this.setLength(width);
    }

    @Override
    public int getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(int length) {
        this.setLength(length);
    }
}
