package lesson3;

public class Test5 {
    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//        System.out.println(!a);
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;
        //boolean e = a > b && c++ == d; // false && false
        boolean e = a < b | ++c == d; // true || true
        System.out.println(e);
        System.out.println(c);
    }
}
