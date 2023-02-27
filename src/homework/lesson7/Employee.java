package homework.lesson7;

public class Employee {

//    Employee(int _id, String _surname, int _age, double _salary, String _department) {
//        this.id = _id;
//        this.surname = _surname;
//        this.age = _age;
//        this.salary = _salary;
//        this.department = _department;
//    }
//
//    public Employee(int _idConstructor, String _surnameConstructor, int _ageConstructor) {
//        this(_idConstructor, _surnameConstructor, _ageConstructor, 0.0, null);
//    }
//
//    private Employee(double _salaryConstructor, String _departmentConstructor){
//        this(0,null,0,2550.50,"Department 1");
//    }

    public Employee(int idConstruct){
        id = idConstruct;
    }

    Employee(String surnameConstruct){
        surname = surnameConstruct;
    }

    private Employee(double salaryConstruct){
        salary = salaryConstruct;
    }

    public String surname;
    int id;
    int age;
    String department;
    private double salary;

    public static void increaseSalary(Employee employee) {
        double multiplySalary = employee.salary * 2;
        System.out.println("Salary x2 = " + multiplySalary);
    }

    public static void getId(int id) {
        System.out.println("ID " + id);
    }

    public static void getSurname(String surname) {
        System.out.println("Surname " + surname);
    }

    public static void getSalary(double salary) {
        System.out.println("Salary " + salary);
    }

}
