package homeWorks.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double zarplataX2() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Kystaubay", 27, 100000, "full stack dev");
        Employee employee2 = new Employee(2, "Kurbonova", 26, 120000, "solution architech");

        System.out.println("Увеличить зар.плату " + employee2.surname + " в два раза: ");
        System.out.println(employee2.surname + " теперь получает: " + employee2.zarplataX2());

        System.out.println("Увеличить зар.плату " + employee1.surname + " в два раза: ");
        System.out.println(employee1.surname + " теперь получает: " + employee1.zarplataX2());
    }
}
