package lesson4;

public class Student {

    int studentCardNumber;
    String nameStudent;
    String surnameStudent;
    int yearOfStudy;
    double averageGradeMath;
    double averageGradeEconomics;
    double averageGradeEnglish;

}

class StudentTest {
    public static void main(String[] args) {

        Student sergey = new Student();
        sergey.studentCardNumber = 123;
        sergey.nameStudent = "Sergey";
        sergey.surnameStudent = "Zavada";
        sergey.yearOfStudy = 2023;
        sergey.averageGradeMath = 4.5;
        sergey.averageGradeEconomics = 3.5;
        sergey.averageGradeEnglish = 4.8;

        Student alex = new Student();
        alex.studentCardNumber = 125;
        alex.nameStudent = "Alex";
        alex.surnameStudent = "Vasilchenko";
        alex.yearOfStudy = 2023;
        alex.averageGradeMath = 4.3;
        alex.averageGradeEconomics = 4.3;
        alex.averageGradeEnglish = 3.1;

        Student ilia = new Student();
        ilia.studentCardNumber = 124;
        ilia.nameStudent = "Ilia";
        ilia.surnameStudent = "Nankov";
        ilia.yearOfStudy = 2023;
        ilia.averageGradeMath = 3.8;
        ilia.averageGradeEconomics = 4.4;
        ilia.averageGradeEnglish = 4.9;



        System.out.println("Average grade of: " + sergey.nameStudent + " " + sergey.surnameStudent + " " + (sergey.averageGradeEconomics + sergey.averageGradeMath + sergey.averageGradeEnglish) / 3);
        System.out.println("Average grade of: " + alex.nameStudent + " " + alex.surnameStudent + " " + (alex.averageGradeEconomics + alex.averageGradeMath + alex.averageGradeEnglish) / 3);
        System.out.println("Average grade of: " + ilia.nameStudent + " " + ilia.surnameStudent + " " + (ilia.averageGradeEconomics + ilia.averageGradeMath + ilia.averageGradeEnglish) / 3);

    }
}