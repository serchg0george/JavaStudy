package homework.practice_encapsulation_lesson_22.clear_encapsulation;

public class StartPracticeEncapsulation {

    public static void main(String[] args) {
        EncapsulationLessonStudent studentSergey = new EncapsulationLessonStudent();
        studentSergey.setStudentName(new StringBuilder("Sergey"));
        studentSergey.setStudentCourse(4);
        studentSergey.setStudentGrade(9.3);
        studentSergey.showInfo();
    }
}
