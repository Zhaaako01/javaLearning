package lesson22;

public class Test3 {

}

class Human2 {

    Human2(String n) {
        this(n, null);

    }

    String name = "Kolya";
    String surname = "Kolya";

    Human2(String n, String s) {
        super();
        this.name = n;
        this.surname = s;
    }
}

class Student2 extends Human2 {
    Student2() {
        this(5);
        System.out.println("Hello");
    }

    Student2(int i) {
        super("Petya");
    }

    public static void main(String[] args) {
        Student2 st = new Student2();
    }
}