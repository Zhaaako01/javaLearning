package homeWorks.lesson8;

public class Chisla {
    static double multiplication(int a, int b, int c) {
        System.out.println("Умножение " + a + " на " + b + " и на " + c + " = " + (a * b * c));
        return a * b * c;
    }

    static void division(int a, int b) {
        System.out.println("Целое частное = " + (a / b) + " остаток от деления = " + (a % b));
    }

    public static void main(String[] args) {
        multiplication(5, 6, 7);
        multiplication(7, 8, 0);
        division( 5, 3);
        division(18, 5);

    }
}
