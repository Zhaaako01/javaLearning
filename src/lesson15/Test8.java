package lesson15;

public class Test8 {
    public static void main(String[] args) {
        // пример логичности использования do while
        int money = 0;
        do {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
        } while (money > 50);
        System.out.println(money);
    }
}
