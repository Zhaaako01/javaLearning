package lesson14;

public class Test16 {

    public void time() {
        // После 30 минут программа выходит из inner loop-a
        // но outer loop работает дальше
        OUTER: for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Начало outer loopa");
           INNER: for (int minute = 0; minute <= 59; minute++) {
                System.out.println(chas + ":" + minute);
                if (minute == 30) {
                    break INNER;
                }
            }

            System.out.println("Конец outer loopa");
        }
    }

    public static void main(String[] args) {
        Test16 test16 = new Test16();
        test16.time();
    }
}
