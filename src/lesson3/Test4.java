package lesson3;

public class Test4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 5;

        boolean b1 = a >= b;
        boolean b2 = b <= c;
        boolean b3 = c != b;

        boolean x = true;
        boolean y = false;
        boolean z = true;

        //boolean result = x && y && z;
        boolean result = x || y || z;

        System.out.println(result);
    }
}
