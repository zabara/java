package main.java.com.AlexZabara.practice.module03.task03_3;

import javax.xml.crypto.Data;

public class Course {
    private Data startData;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Data startData, String name) {
        this.startData = startData;
        this.name = name;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }
    public Course(){}
}
