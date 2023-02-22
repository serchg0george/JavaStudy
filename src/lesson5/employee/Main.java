package lesson5.employee;

public class Main {
    public static void main(String[] args) {
        EmployeeTest employeeTest = new EmployeeTest();
        Employee.increaseSalary(employeeTest.firstWorker);
        Employee.increaseSalary(employeeTest.secondWorker);
    }
}
