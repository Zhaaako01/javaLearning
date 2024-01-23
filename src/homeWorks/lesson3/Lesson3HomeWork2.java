package homeWorks.lesson3;

public class Lesson3HomeWork2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int x = a-- - --a + ++a + a++ + a;
        int y = ++b - b++ + ++b - --b;
        System.out.println(x);
        System.out.println(y);
    }
}
