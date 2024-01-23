package lesson5;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.colour = "White";
        car1.engine = "V6";
        car1.speed = 60;

        car1.showInfo();
        car1.gaz(20);
        car1.showInfo();
        car1.tormoz(80);
        car1.showInfo();
    }
}
