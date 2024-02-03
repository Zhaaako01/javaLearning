package lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Teacher t = new Teacher();
//        //e.sleep();
//        t.sleep();
//        Employee emp2 = new Teacher();
////        emp2.sleep();
        System.out.println(t.salary);
    }
}

class Eda {

}

class Frukti extends Eda {

}

class Employee {
    String name = "Kolya";
    double salary = 100;

    public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda eda = new Eda();
        return eda;
    }

    static void sleep() {
        System.out.println("spit rabotnik");
    }
}

class Teacher extends Employee {
    double salary = 200;
    int kolichestvoUchenikov;

    @Override
    public Frukti eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    void uchit() {
        System.out.println("uchit");
    }

    static void sleep() {
        System.out.println("spit uchitel");
    }
}
