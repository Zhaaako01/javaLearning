package homeWorks.lesson6;

public class SummaChisel {
    int summa() {
        System.out.println("Слагаемый отсутствует! Сумма: " + 0);
        return 0;
    }

    int summa(int a) {
        System.out.println("Cумма: " + a);
        return a;
    }

    int summa(int a, int b) {
        System.out.println("Cумма: " + (a + b));
        return a + b;
    }

    int summa(int a, int b, int c) {
        System.out.println("Cумма: " + (a + b + c));
        return a + b + c;
    }

    int summa(int a, int b, int c, int d) {
        System.out.println("Cумма: " + (a + b + c + d));
        return a + b + c + d;
    }
}

class SummaChiselTest {
    public static void main(String[] args) {
        SummaChisel summaChisel = new SummaChisel();
        summaChisel.summa();
        summaChisel.summa(4);
        summaChisel.summa(4, 5);
        summaChisel.summa(4, 5, 6);
        summaChisel.summa(4, 5, 6, 7);
    }
}
