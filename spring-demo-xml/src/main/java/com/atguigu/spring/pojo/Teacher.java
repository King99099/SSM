package com.atguigu.spring.pojo;

/**
 * ClassName:Teacher
 * Package: com.atguigu.spring.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 12:01
 * @Version: v1.0
 */
public class Teacher {
    private Integer teacherId;
    private String teacherName;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher(Integer teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

}
