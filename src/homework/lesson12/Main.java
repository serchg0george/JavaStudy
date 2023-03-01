package homework.lesson12;
public class Main {

    public static void main(String[] args) {
//        Student firstStudent = new Student("Ivan", 3, 9.5);
//        Student secondStudent = new Student("Petr", 1, 5.3);
//
//        Student.changeName(secondStudent);
//        System.out.println(secondStudent.name);

        StudentTest compareStudents = new StudentTest();

        compareStudents.simpleCompareTwoStudents();
        compareStudents.detailedCompareTwoStudents();
    }
}
