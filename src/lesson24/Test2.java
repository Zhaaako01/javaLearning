package lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}

abstract class Figura {
//    Figura(int kolichestvoStoron) {
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    int kolichestvoStoron = 0;

    abstract void perimeter();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура!");
    }
}

class Kvadrat extends Figura {
//    Kvadrat(int kolichestvoStoron) {
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimeter() {

        System.out.println("Perimeter kvadrata = " + kolichestvoStoron * storona1);
    }

    void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamaugolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimeter() {

        System.out.println("Perimeter Pryamaugolnika = " + 2 * (storona1 + storona2));
    }

    void ploshad() {
        System.out.println("Ploshad Pryamaugolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;

    public void perimeter() {

        System.out.println("Perimeter Okrujnosti = " + 2 * 3.14 * radius);
    }

    void ploshad() {
        System.out.println("Ploshad Okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class ChetirexUgolnik extends Figura {
    void def() {
        System.out.println("eto ChetirexUgolnik");
    }
}