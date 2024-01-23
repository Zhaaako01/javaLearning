package homeWorks.lesson6;

public class Student {
    int idNumber;
    String firstName;
    String lastName;
    int course;
    double mathGrade;
    double economicsGrade;
    double foreignLangGrade;

    Student(int idNumber2, String firstName2, String lastName2, int course2,
            double mathGrade2, double economicsGrade2, double foreignLangGrade2) {
        idNumber = idNumber2;
        firstName = firstName2;
        lastName = lastName2;
        course = course2;
        mathGrade = mathGrade2;
        economicsGrade = economicsGrade2;
        foreignLangGrade = foreignLangGrade2;
    }

    Student(int idNumber3, String firstName3, String lastName3, int course3) {
        this(idNumber3, firstName3, lastName3, course3, 0.0, 0.0, 0.0);
    }

    Student() {
    }
}


class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student(7, "Severus", "Snape", 4);
        Student st3 = new Student(6, "Tom", "Readle", 5, 5, 5, 5);

        System.out.println(st1.idNumber);
        System.out.println(st2.economicsGrade);
        System.out.println(st3.lastName);
    }
}
