package homework.lesson12;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student firstStudent, Student secondStudent) {
        Student thirdStudent = firstStudent;
        firstStudent = secondStudent;
        secondStudent = thirdStudent;
        System.out.println(firstStudent.name);
    }

    public static void changeName(Student firstStudent) {
        firstStudent.name = "Vasiliy";
    }

}
