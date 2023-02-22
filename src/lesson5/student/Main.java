package lesson5.student;

public class Main {

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

        StudentTest.calculateAverageGrade(sergey);
        StudentTest.calculateAverageGrade(alex);
        StudentTest.calculateAverageGrade(ilia);


    }


}
