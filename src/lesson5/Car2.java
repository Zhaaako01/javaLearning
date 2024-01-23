package lesson5;

public class Car2 {
    Car2(String cvet, String motor) {
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color + "; мотор машины: " + engine);
        //System.out.println("Цвет машины: " + cvet + "; мотор машины: " + motor);
    }

    String color;
    String engine;
}

class CarTest2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2("yellow", "V4");
        Car2 car2 = new Car2("black", "V8");

    }
}
