package lesson19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};
        for (String s : students) {
            for (String e : exams) {
                System.out.println(s + " " + e);
            }
        }
    }
}
