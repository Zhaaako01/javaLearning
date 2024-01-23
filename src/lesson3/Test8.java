package lesson3;

public class Test8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        //int c = ++a - b * 2; // 1 + 10 - 6
        //int c = (++a - b) * 2; // ((1 + 10) -3) * 2
        System.out.println(a);
        int c = (a-- - b) * 2; // (10 - 3) * 2 ||| a = 9
        System.out.println(c);
        System.out.println(a);

    }
}
