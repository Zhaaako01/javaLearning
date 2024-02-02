package lesson22;

public class Test2 {

    void uvelichZP(Employee employee) {
        employee.salary = employee.salary + 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("sleep");
    }
}

class Doctor extends Employee {


    void lechit() {
        System.out.println("lechit");
    }

    class Xirurg extends Doctor {
        String skalpel;

        void operaciya() {
            System.out.println("operaciya");
        }
    }

    class Dentist extends Doctor {
        String ruchka;

        void chistkaZuba() {
            System.out.println("chistka zuba");
        }
    }
}

class Teacher extends Employee {

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}

class Driver extends Employee {

    String nazvanieMashini;

    void vodit() {
        System.out.println("vodit");
    }
}