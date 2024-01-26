package lesson15;

public class Test10 {
    public static void main(String[] args) {
        // выведи на экран минуты и с помощью nested loop-ов,
        // пускай outer цикл будет for, а inner цикл while

        OUTER:
        for (int minute = 0; minute < 60; minute++) {
            int second = 0;
            INNER:
            while (second < 60) {
                System.out.println(minute + ":" + second);
                second++;
            }
        }
    }
}
