package lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
        this.changeColor("red");
    }

    public void changeColor(String newColor) {
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        this.color = newColor;
        cena += 1000;
    }
}
