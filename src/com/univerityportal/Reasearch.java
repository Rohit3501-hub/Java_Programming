package com.univerityportal;

public class Reasearch extends Student {

    private String researchTopic;
    private String guideName;

    public Reasearch(int id, String name, int age, String gender, int rollNumber, String course, String researchTopic, String guideName) {
        super(id, name, age, gender, rollNumber,course, researchTopic, course);
        this.researchTopic = researchTopic;
        this.guideName = guideName;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Guide Name: " + guideName);
    }
}
