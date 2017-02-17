package main.java.com.AlexZabara.practice.module03.task03_3;

public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(){}

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(lastName, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
