package homeWorks.lesson11;

public class Car {
    String color;
    String engine;
    int doorAmount;

    Car(String color, String engine, int doorAmount) {
        this.color = color;
        this.engine = engine;
        this.doorAmount = doorAmount;
    }
}

class CarTest {
    static void changeDoorAmount(Car car1, int a) {
        car1.doorAmount = a;
    }

    static void changeColor(Car car1, Car car2) {
        String s = car1.color;
        car1.color = car2.color;
        car2.color = s;
//        System.out.println(car1.color);
//        System.out.println(car2.color);

    }

    public static void main(String[] args) {
        Car merc = new Car("Black", "v10", 4);
        Car audi = new Car("Blue", "V8", 4);
        changeColor(merc, audi);

//        System.out.println(merc.color);
//        System.out.println(audi.color);

        changeDoorAmount(audi, 6);

        System.out.println(merc.color);
        System.out.println(merc.engine);
        System.out.println(merc.doorAmount);

        System.out.println("---------------");

        System.out.println(audi.color);
        System.out.println(audi.engine);
        System.out.println(audi.doorAmount);


    }
}
