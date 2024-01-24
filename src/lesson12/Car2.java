package lesson12;

public class Car2 {
    int engine;
    int doorCount;

    Car2(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2(3, 4);
        Car2 c2 = new Car2(2, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Moshnost motora i kolichestvo dverey u pervoi mashini bolshe");
            } else {
                System.out.println("Moshnost motora u pervoi mashini bolshe, a kolichestvo dverey menshe");
            }
        } else {
            System.out.println("Moshnost motora u pervoi mashini menshe");
        }
    }
}

