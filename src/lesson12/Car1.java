package lesson12;

public class Car1 {
    int engine;
    int doorCount;

    Car1(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car1 c1 = new Car1(3, 4);
        Car1 c2 = new Car1(2, 5);

        if (c1.engine > c2.engine)  // --> самый внешний if
            if (c1.doorCount > c2.doorCount) // --> самый внутренний if
                System.out.println("Moshnost motora i kolichestvo dverey u pervoi mashini bolshe");
            else  // --> самый внутренний else
                System.out.println("Moshnost motora u pervoi mashini bolshe, a kolichestvo dverey menshe");
        else  // --> самый внешний else
            System.out.println("Moshnost motora u pervoi mashini menshe");


    }
}