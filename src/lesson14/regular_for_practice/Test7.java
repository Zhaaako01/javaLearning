package lesson14.regular_for_practice;

public class Test7 {
    public static void main(String[] args) {
        for (int i = 5; i < 11; i++, abc(10)) {
            System.out.println(i);
        }
    }

    static void abc(int n) {
        System.out.println(n);
    }
}

