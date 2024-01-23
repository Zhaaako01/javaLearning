package lesson3;

public class Test3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        //a = a + 3;
        a += 3;
        System.out.println(a);

        //b = b - 2;
        b -= 2;
        System.out.println(b);

        int c = 4;
        //c = c * 2
        c *= 2;
        System.out.println(c);

        int d = 9;
        //d = d / 3
        d /= 3;
        System.out.println(d);

        byte x = 127;
        x += 1;
        System.out.println(x);

        long q = 100L;
        int w = 10;
        q = w;
        System.out.println(q);
    }
}
