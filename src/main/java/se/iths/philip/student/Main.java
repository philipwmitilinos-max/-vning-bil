package se.iths.philip.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Philip", 123, "");
        student.setGrade("VG");
        student.printInfo();
    }
}
