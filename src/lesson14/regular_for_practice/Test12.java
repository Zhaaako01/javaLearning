package lesson14.regular_for_practice;

public class Test12 {
    public static void main(String[] args) {
        // надо написать цифры от 1 до 100, но не будем
        // выводить число 87
        for (int i = 1; i <= 100; i++) {
            if (i == 87) {
                continue;
            }
            System.out.println(i);
        }
    }
}