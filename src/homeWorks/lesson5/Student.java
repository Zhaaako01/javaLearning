package homeWorks.lesson5;

public class Student {
    int idNumber;
    String firstName;
    String lastName;
    int course;
    double mathGrade;
    double economicsGrade;
    double foreignLangGrade;

}

class StudentTest {

    double sreednyaOcenka(Student student) {
        double result = (student.mathGrade + student.economicsGrade + student.foreignLangGrade) / 3;
        System.out.println("Средняя оценка " + student.firstName + " " + student.lastName + ": " + result);
        return result;

    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        student1.idNumber = 1;
        student1.firstName = "Zhalgas";
        student1.lastName = "Kystaubay";
        student1.course = 1;
        student1.mathGrade = 4;
        student1.economicsGrade = 4;
        student1.foreignLangGrade = 4;


        student2.idNumber = 2;
        student2.firstName = "Mokhsira";
        student2.lastName = "Kurbonova";
        student2.course = 1;
        student2.mathGrade = 4;
        student2.economicsGrade = 3;
        student2.foreignLangGrade = 5;

        student3.idNumber = 3;
        student3.firstName = "Zhandos";
        student3.lastName = "Kystaubay";
        student3.course = 1;
        student3.mathGrade = 4;
        student3.economicsGrade = 5;
        student3.foreignLangGrade = 3;

        StudentTest stTest = new StudentTest();
        stTest.sreednyaOcenka(student1);
        stTest.sreednyaOcenka(student2);
        stTest.sreednyaOcenka(student3);


    }
}
