package com.univerityportal;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********PROFESSOR DETAILS********");
        System.out.println("Enter Professor ID: ");
        int profId = sc.nextInt();
        System.out.println("Enter Professor Name: ");
        String profName = sc.next();
        System.out.println("Enter Professor Age: ");
        int profAge = sc.nextInt();
        System.out.println("Enter Professor Gender: ");
        String profGender = sc.next();



        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {


            case 1:
                System.out.println();
                System.out.println("Enter Employee ID: ");
                int empId = sc.nextInt();
                System.out.println("Enter Department: ");
                String department = sc.next();
                System.out.println("Enter Specialization: ");
                String specialization = sc.next();
                System.out.println("Enter Salary: ");
                double salary = sc.nextDouble();

                Professor professor = new Professor(profId, profName, profAge, profGender, empId, department, specialization, salary);
                professor.displayDetails();
                break;

            case 2:
                System.out.println("********STUDENT DETAILS********");
                System.out.println("Enter Student ID: ");
                int studentId = sc.nextInt();
                System.out.println("Enter Student Name: ");
                String studentName = sc.next();
                System.out.println("Enter Student Age: ");
                int studentAge = sc.nextInt();
                System.out.println("Enter gender: ");
                String studentGender = sc.next();
                System.out.println("Enter Roll Number ");
                int studentRollNumber = sc.nextInt();
                System.out.println("Enter Course: ");
                String studentCourse = sc.next();
                System.out.println("Enter Research Topic: ");
                String researchTopic = sc.next();
                System.out.println("Enter Guide Name :");
                String guideName = sc.next();

                Student student = new Student(studentId, studentName, studentAge, studentGender, studentRollNumber, studentCourse, researchTopic, guideName);
                student.displayDetails();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}