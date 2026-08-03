package JavaAssessmentPaper;

public class Student {
    private int rollNo;
    private String studentName;
    private int[] marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(int rollNo, String studentName, int[] marks) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.marks = marks;

    }

    public double Calculate() {
        double totalmarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalmarks += marks[i];
        }

        return totalmarks;
    }

    public double average() {
        double average = Calculate() / marks.length;
        return average;
    }

    public void grade() {
        double average = average();
        if (average >= 90) {
            System.out.println("A++");

        } else if (average < 90 && average > 75) {
            System.out.println("A");
        } else if (average < 75 && average > 60) {
            System.out.println("B");
        } else if (average < 60 && average > 50) {
            System.out.println("C");
        } else if (average < 50 && average > 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail");

        }

        }
    public static void main (String[]args){
        System.out.println("********STUDENT DETAILS********");
        int marks[] = { 90,88,92,84,90};
        System.out.println("Roll Number: 101");
        System.out.println("Student Name: Sujay");
        Student student = new Student(101, "John Doe", marks);
        System.out.println("Total Marks: " + student.Calculate());
        System.out.println("Average Marks: " + student.average());
        System.out.print("Grade: ");
        student.grade();

        System.out.println("************The End**************");

    }
}