package lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov = " + count);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(st1.name);
        System.out.println(Student.count);
        System.out.println(st3.count);
        System.out.println(st2.course);
        showCount();
        Student.showCount();
        st2.showCount();
    }
}
