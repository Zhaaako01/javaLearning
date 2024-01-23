package lesson6;

public class Employee {

    public Employee(int id2, String surname2, int age2) {
        //как ниже написать нельзя, компилятор не допускает
        //Employee(surname2, age2);
        this(surname2, age2);
        id = id2;
    }

    public Employee(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

// Нельзя создать конструктор с одинаковыми параметрами!
//    Employee(String surname2, int age2){
//        System.out.println("asdasd");
//    }

    protected Employee(int id4, String surname4, int age4, double salary4, String department4) {
        this(id4, surname4, age4);
        //this надо писать первым!
        //this(surname4, age4);
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.department);
        Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
