package com.swg.creational.builder;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 0:00
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String coursVideo;
    private String courseArticle;
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCoursVideo() {
        return coursVideo;
    }

    public void setCoursVideo(String coursVideo) {
        this.coursVideo = coursVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", coursVideo='" + coursVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
