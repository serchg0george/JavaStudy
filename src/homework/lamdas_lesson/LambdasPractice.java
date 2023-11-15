package homework.lamdas_lesson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


public class LambdasPractice {
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    static class Student {
        private String name;
        private Character sex;
        private Integer age;
        private Integer course;
        private Double averageGrade;
    }

    static class StudentInfo {
        void printStudent(Student student) {
            System.out.println("Student name: " + student.getName() + ", sex: " + student.getSex() +
                    ", age:" + student.getAge() + ", course: " + student.getCourse() + ", average grade: " + student.getAverageGrade());
        }

        void testStudents(ArrayList<Student> studentArrayList, StudentsChecks studentsChecks) {
            for (Student s : studentArrayList) {
                if (studentsChecks.test(s)) {
                    printStudent(s);
                }
            }
        }

        void printStudentOverGrade(ArrayList<Student> studentArrayList, Double averageGrade) {
            for (Student student :
                    studentArrayList) {
                if (student.getAverageGrade() > averageGrade) {
                    printStudent(student);
                }
            }
        }

        void printStudentUnderGrade(ArrayList<Student> studentArrayList, Double averageGrade) {
            for (Student student :
                    studentArrayList) {
                if (student.getAverageGrade() < averageGrade) {
                    printStudent(student);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> studentsArrayList = new ArrayList<>();
        Student studentOne = new Student("Ivan", 'm', 22, 3, 8.3);
        Student studentTwo = new Student("Alex", 'm', 27, 4, 5.3);
        Student studentThree = new Student("Maria", 'f', 22, 2, 7.3);
        Student studentFour = new Student("Sergey", 'm', 24, 1, 9.3);
        Student studentFive = new Student("Veronica", 'f', 35, 4, 6.3);

        studentsArrayList.add(studentOne);
        studentsArrayList.add(studentTwo);
        studentsArrayList.add(studentThree);
        studentsArrayList.add(studentFour);
        studentsArrayList.add(studentFive);

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.testStudents(studentsArrayList, st -> st.getAverageGrade() > 5);
    }

    interface StudentsChecks {
        Boolean test(Student student);
    }
}
