package lesson15;

public class Test9 {

    public static void main(String[] args) {
        // выведи на экран час и минуты с помощью
        // nested loop-ов

        int chas = 0;

        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(chas + ":" + minute);
                minute++;
            }
            chas++;
        } while (chas < 24);
    }
}
