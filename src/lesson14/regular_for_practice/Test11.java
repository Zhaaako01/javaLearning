package lesson14.regular_for_practice;

public class Test11 {
    public static void main(String[] args) {
        //если i становилась равным 7 этот цикл заканчивает свою работу
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
