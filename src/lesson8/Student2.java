package lesson8;

public class Student2 {
    String name;
    int course;
    static int count;
    int a;

    public Student2(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov = " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the student class");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd(){
        //так не можешь написать
        //надо создать объекта и после писать то что внизу
        //a++;
        count++;
        Student2 st2 = new Student2("Petr",20);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student2 st3 = new Student2("Petr",20);
        st3.abc();
    }
}
