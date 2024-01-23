package lesson3;

public class Test2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + b;

        System.out.println(a + b);
        System.out.println(c);

        int c2 = b - a;
        System.out.println(b - a);
        System.out.println(c2);

        int c3 = a * b;
        System.out.println(a * b);
        System.out.println(c3);

        int a2 = 10;
        int b2 = 3;
        int c4 = a2 / b2;
        System.out.println(c4);
        System.out.println(a2 / b2);

        double a3 = 11;
        double b3 = 3;
        double c5 = a3 / b3;
        System.out.println(c5);
        System.out.println(a3 / b3);

        int a4 = 11;
        int b4 = 3;
        int celayaChast = a4 / b4;
        int ostatok = a4 % b4;
        System.out.println(celayaChast);
        System.out.println(ostatok);

        double q = 5.5;
        double w = 3.5;

        double e = q % w;
        double e2 = q / w;
        System.out.println(e);
        System.out.println(e2);


        int x = 5;
        int y = 3;
        //int z = x - y++;
        int z = x+ ++y;
        System.out.println(z);
        System.out.println(y);
    }
}
