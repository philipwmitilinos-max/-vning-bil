package se.iths.philip.student;

public class Student {
    private String name;
    private int studentId;
    private String grade;

    public Student(String name, int studentId, String grade) {
        this.name = name;
        this.studentId = studentId;
        //this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Namn: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Betyg: " + grade);
    }
}
