package lesson19;

public class Test2 {
//    static void summa(int a, int b) {
//        System.out.println(a + b);
//    }
//
////    static void summa(int a, int b, int c) {
////        System.out.println(a + b + c);
////    }
////
////    static void summa(int a, int b, int c, int d) {
////        System.out.println(a + b + c + d);
////    }

    static void summa(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    static void summa1(int[] a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    static void summa2(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public void abc(int[]... array) {

    }

    public static void main(String... args) {
        summa2("ok", 3, 8, 9, 7);
        summa2("ok", new int[]{7, 9, 0});
        //summa2("ok", null);
        summa(1, 2, 3);
    }
}
