package lesson16;

 public class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        //мы не можем плюсовать double и boolean как показано ниже
        //System.out.println(emp.isManager + emp.salary);
        //но мы можем плюсовать String и с double и с boolean
        System.out.println("On manager? " + emp.isManager + " ego z/p: " +emp.salary);
    }
}