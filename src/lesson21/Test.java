package lesson21;

public class Test {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a < 4 ? 7 : "privet");
        int b = 5;
        int c = 5;
        int d = (b < 6) ? b++ : c++;
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }
}
