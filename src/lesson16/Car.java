package lesson16;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // создаю метод который будет возвращать объект Car
    public Car abc(String color) {
        Car c10 = new Car(color, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.color + c2.engine);
    }
}

