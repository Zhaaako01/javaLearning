package homeWorks.lesson12;

import lesson11.Student;

public class StudentTest {
    static void sravniVoobwe(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студент " + st1.name + " и студент " + st2.name + " эдинтичны");
        } else {
            System.out.println("Студент " + st1.name + " и студент " + st2.name + " НЕ равны");
        }
    }

    static void sravniPoAtriburam(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена, курсы и оценьки студентов равны");
                } else {
                    System.out.println("Имена и курсы одинаковые но Оценьки студентов НЕ равны");
                }

            } else {
                System.out.println("Имена одинаковые но Курсы студентов НЕ равны");
            }

        } else {
            System.out.println("Имена студентов НЕ равны");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 1, 4.5);
        Student student2 = new Student("Ivan", 1, 4.5);

        Student student3 = new Student("Kolya", 1, 3.3);
        Student student4 = new Student("Kolya", 4, 4.5);
        Student student5 = new Student("Kolya", 4, 5);

        sravniVoobwe(student1, student2);
        sravniVoobwe(student1, student4);

        sravniPoAtriburam(student1, student2);
        sravniPoAtriburam(student3, student4);
        sravniPoAtriburam(student4, student5);

    }
}

