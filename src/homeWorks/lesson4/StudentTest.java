package homeWorks.lesson4;

public class StudentTest {
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

        System.out.println("Средняя оценка " + student1.firstName + " " + student1.lastName + ": " +
                (student1.mathGrade + student1.economicsGrade + student1.foreignLangGrade) / 3);

        System.out.println("Средняя оценка " + student2.firstName + " " + student2.lastName + ": " +
                (student2.mathGrade + student2.economicsGrade + student2.foreignLangGrade) / 3);

        System.out.println("Средняя оценка " + student3.firstName + " " + student3.lastName + ": " +
                (student3.mathGrade + student3.economicsGrade + student3.foreignLangGrade) / 3);
    }
}
