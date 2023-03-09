package homework.practice_encapsulation_lesson_22.clear_encapsulation;

public class EncapsulationLessonStudent {
    private StringBuilder studentName;
    private int studentCourse;
    private double studentGrade;

    public StringBuilder getStudentName() {
        StringBuilder stringBuilder = new StringBuilder(studentName);
        return stringBuilder;
    }

    public void setStudentName(StringBuilder studentName) {
        if (studentName.length() > 3){
            this.studentName = studentName;
        }
        System.out.println("Not enough symbols in the name");
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        if (studentCourse < 1 || studentCourse > 4) {
            return;
        }
        this.studentCourse = studentCourse;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        if (studentGrade < 1 || studentGrade > 10) {
            return;
        }
        this.studentGrade = studentGrade;
    }

    public void showInfo() {
        System.out.print("Student name: " + getStudentName() + " Student course: " + getStudentCourse() + " Student grade: " + getStudentGrade() + ".");
    }

}
