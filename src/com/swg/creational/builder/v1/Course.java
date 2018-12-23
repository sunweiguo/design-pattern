package com.swg.creational.builder.v1;

/**
 * @Author 【swg】.
 * @Date 2018/12/23 20:54
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String coursVideo;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBulder courseBulder){
        this.courseName = courseBulder.courseName;
        this.courseArticle = courseBulder.courseArticle;
        this.coursePPT = courseBulder.coursePPT;
        this.courseQA = courseBulder.courseQA;
        this.coursVideo = courseBulder.coursVideo;
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

    public static class CourseBulder{
        private String courseName;
        private String coursePPT;
        private String coursVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBulder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBulder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBulder buildCoursVideo(String coursVideo){
            this.coursVideo = coursVideo;
            return this;
        }
        public CourseBulder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBulder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }
        public Course makeCourse(){
            return new Course(this);
        }
    }

}
