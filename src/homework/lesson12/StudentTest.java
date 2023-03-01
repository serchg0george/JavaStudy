package homework.lesson12;

public class StudentTest {
    Student firstStudent = new Student("Ilya", 4, 9.5);
    Student secondStudent = new Student("Ilya", 3, 8.7);

    public void simpleCompareTwoStudents() {
        if (firstStudent == secondStudent) {
            System.out.println("This is the same students");
        } else {
            System.out.println("This is different students");
        }
    }

    public void detailedCompareTwoStudents() {
        if (firstStudent.name == secondStudent.name) {
            System.out.println("Same name");
            if (firstStudent.course == secondStudent.course){
                System.out.println("Same name and course");
                if (firstStudent.grade == secondStudent.grade){
                    System.out.println("Same name, course and grade");
                }else {
                    System.out.println("Students have different grade");
                }
            } else {
                System.out.println("Students have different course");
            }
        } else {
            System.out.println("Student have different name");
        }
    }
}
