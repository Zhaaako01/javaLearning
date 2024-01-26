package lesson14;

public class Test14 {
    //вывести на экран каждую минуту во времени
    //00:00
    //00:01
    //00:02

    public void time() {
        for (int chas = 0; chas <= 23; chas++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int second = 0; second <= 59; second++) {
                    System.out.println(chas + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        Test14 t = new Test14();
        t.time();
    }
}
