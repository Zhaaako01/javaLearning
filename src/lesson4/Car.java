package lesson4;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a = 5;
        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "v8";

        System.out.println("Cvet: " + car1.color + " Motor: " + car1.engine + a);
    }
}
