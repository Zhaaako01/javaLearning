package lesson12;

public class Test7 {
    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        } else {
            System.out.println("Maximum - " + i3);
        }
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.maximum(4, 7, 0);
    }
}
