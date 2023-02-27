package homework.lesson5.employee;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public static void increaseSalary(Employee employee) {
        double multiplySalary = employee.salary * 2;
        System.out.println("Salary x2 = " + multiplySalary);
    }

  /*    double increaseSalary(){
        double multiplySalary = salary * 2;
        System.out.println("Salary x2 = " + multiplySalary);
        return multiplySalary;
    }*/

}

