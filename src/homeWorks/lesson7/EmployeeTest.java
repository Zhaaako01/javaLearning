package homeWorks.lesson7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(10);
        Employee emp2 = new Employee("Ktoto");
        //так как модификатор доступа переменной salary - private
        //Employee emp3= new Employee(5111.1);
        Employee emp4 = new Employee("Sidorov", 1);
        emp4.getSalary();
        emp1.getSalary();
        // sout не может показать salary,
        // так как модификатор доступа salary - private
        //System.out.println(emp1.salary);
        System.out.println(emp1.id);
        System.out.println(emp1.surname);

    }
}
