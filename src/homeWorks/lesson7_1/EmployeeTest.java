package homeWorks.lesson7_1;

import homeWorks.lesson7.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //не могу создать так как модификатор доступа переменной salary - private,
        // и модификатор доступа переменной id - default
        //homeWorks.lesson7.Employee emp1 = new homeWorks.lesson7.Employee(1, "Ktoto", 5000.0);
        homeWorks.lesson7.Employee emp2 = new homeWorks.lesson7.Employee(15);
        //не могу создать так как конструктор private
        // homeWorks.lesson7.Employee emp3= new homeWorks.lesson7.Employee(5111.1);
        Employee emp4 = new Employee("Sidorov", 1);
        emp2.getSalary();
        emp2.getId();
    }
}
