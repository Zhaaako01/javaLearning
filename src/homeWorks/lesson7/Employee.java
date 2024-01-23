package homeWorks.lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }

    public void getSalary() {
        System.out.println("SALARY = " + salary);
    }

    Employee(String surname2) {
        surname = surname2;
    }

    public Employee(int id2) {
        id = id2;
    }

    private Employee(double salary2) {
        salary = salary2;
    }

    public Employee(String surname2, int id2) {
        this(surname2);
        id = id2;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(5000.0);
        Employee emp2 = new Employee("Ktoto");
        Employee emp3 = new Employee(5111.1);
        Employee emp4 = new Employee("Sidorov", 1);
        emp1.getSalary();
    }
}
