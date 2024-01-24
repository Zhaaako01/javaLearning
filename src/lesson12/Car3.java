package lesson12;

public class Car3 {
    String color;
    String engine;

    Car3(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car3 c1 = new Car3("black", "V6");
        Car3 c2 = new Car3("red", "V4");
        Car3 c3 = new Car3("red", "V4");
        Car3 c4 = c1;

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c1 == c4);

    }
}
