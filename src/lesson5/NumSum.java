package lesson5;

public class NumSum {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int midArefm(int a2, int b2, int c2){
        int result2 = summa(a2, b2, c2)/3;
        return result2;
    }
}