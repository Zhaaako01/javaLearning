package lesson14.regular_for_practice;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 1, j = 3;i<10; i++, j = j + 3) {
            System.out.println(i + j);
        }
    }
}