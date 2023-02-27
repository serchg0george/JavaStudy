package homework.lesson6.student;

public class Student {

    int studentCardNumber;
    String nameStudent;
    String surnameStudent;
    int yearOfStudy;
    double averageGradeMath;
    double averageGradeEconomics;
    double averageGradeEnglish;

    Student(int cardNumber, String name, String surname, int year, double gradeMath, double gradeEconomics, double gradeEnglish) {
        this.studentCardNumber = cardNumber;
        this.nameStudent = name;
        this.surnameStudent = surname;
        this.yearOfStudy = year;
        this.averageGradeMath = gradeMath;
        this.averageGradeEconomics = gradeEconomics;
        this.averageGradeEnglish = gradeEnglish;
    }

    Student(int cardNumber, String name, String surname, int year) {
        this(cardNumber, name, surname, year, 0, 0, 0);
    }

    Student() {

    }
}
