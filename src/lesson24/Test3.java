package lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.A);
        h.pomosh();
        h.tushitPojar("voda");
        s.swim();
    }
}

class Employee {
    String name;
    int age;
    int experience;
    double salary;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("sleep");
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
    public void tushitPojar(String s) {
        System.out.println("Driver tushit pojar s pomoshiu " + s);
    }

    @Override
    public void swim() {
        System.out.println("Driver mojet plavat");
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
    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar s pomoshiu " + s);
    }
}


interface Help_able {
    void pomosh();

    void tushitPojar(String predmet);

    public final static int A = 10;
}

interface Swim_able {
    void swim();
}