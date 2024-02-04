package lesson24;

public class Test3 {
}

class Employee {
    String name = "Kolya";
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

class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashini;

    void vodit() {
        System.out.println("vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Driver okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Driver tushit pojar");
    }

    @Override
    public void swim() {
        System.out.println("Driver mojet plavat");
    }
}

interface Help_able {
    void pomosh();

    void tushitPojar();
}

interface Swim_able {
    void swim();
}