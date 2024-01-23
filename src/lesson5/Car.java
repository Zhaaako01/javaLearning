package lesson5;

public class Car {
    String colour;
    String engine;
    int speed;

    //прибавляем скорость
    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    //тормозим машину
    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет: " + colour + " мотор: " + engine + " скорость: " + speed);
    }
}
