package lesson8;

public class Car {
    String colour = "blue";
    String engine = "V6";
}

class Human {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        // После того как сделали Car c константой
        // мы не можем создавать новые объекты Car
        //h1.c = new Car();
        //h1.c = new Car();
        h1.c.engine = "V8";
    }
}
