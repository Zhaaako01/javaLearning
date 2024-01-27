package lesson16;

public class Test8 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        System.out.println(x == y);

        String q = "privet";
        String w = " privet".trim();
        System.out.println(q == w);
        System.out.println(q == x);
    }
}
