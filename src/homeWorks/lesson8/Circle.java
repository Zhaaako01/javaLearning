package homeWorks.lesson8;

public class Circle {
    static final double pi = 3.14;

    public double areaOfCircle(int radius) {
        double area = pi * radius * radius;
        //System.out.println("Площадь круга = " + area);
        return area;
    }

    public static double lengthOfCircle(int radius) {
        double length = 2 * pi * radius;
        //System.out.println("Длина круга = " + length);
        return length;
    }

    public void circleInfo(int radius) {
        System.out.println("Радиус круга = " + radius);
        System.out.println("Площадь круга = " + areaOfCircle(radius));
        System.out.println("Длина круга = " + lengthOfCircle(radius));
    }
}
