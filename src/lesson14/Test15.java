package lesson14;

public class Test15 {

    public void time() {
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Начало outer loopa");
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(chas + ":" + minute);
            }
            System.out.println("Конец outer loopa");
        }
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        test15.time();
    }
}
