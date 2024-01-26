package lesson15;

public class Test2 {
    public static void main(String[] args) {
        //пример с казино
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10; //money = money-10;
        }
    }
}
