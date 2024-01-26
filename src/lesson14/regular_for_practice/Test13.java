package lesson14.regular_for_practice;

public class Test13 {
    public static void main(String[] args) {
        // надо написать цифры от 1 до 100, но не будем
        // выводить число 10 и если остаток от деления на 55 = 0 то
        // останавливаем программу
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}

