package lesson10;

import lesson9.Student;

public class B {
    public static void main(String[] args) {
        String st1 = new String("hello");
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c);
    }
}

class C {
    Student st2 = new Student();
}
