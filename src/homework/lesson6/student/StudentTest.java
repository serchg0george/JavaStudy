package homework.lesson6.student;

public class StudentTest {

    public static void calculateAverageGrade (Student student) {
        double averageGrade = (student.averageGradeMath + student.averageGradeEconomics + student.averageGradeEnglish)/3;
        System.out.println("Average grade of: " + student.nameStudent + " " + student.surnameStudent + " " + averageGrade);
    }
}
