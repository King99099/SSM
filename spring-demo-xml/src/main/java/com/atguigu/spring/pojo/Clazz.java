package com.atguigu.spring.pojo;

import java.util.List;

/**
 * ClassName:Clazz
 * Package: com.atguigu.spring.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 11:49
 * @Version: v1.0
 */
public class Clazz {
    private Integer clazzId;
    private String clazzName;


    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", clazzName='" + clazzName + '\'' +
                '}';
    }

    public Clazz() {
    }

    public Clazz(Integer clazzId, String clazzName) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
    }

}
