package com.univerityportal;

public class Student extends person {
    private int rollNumber ;
    private String course;

    public Student(int id, String name, int age, String gender, int rollNumber, String studentCourse, String researchTopic, String course) {
        super(id, name, age, gender);
        this.rollNumber = rollNumber;
        this.course = course;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

