package lesson21;

public class Test3 {
    Test3() {
        System.out.println("Eto konstruktor");
    }

    void Test3() {
        System.out.println("Eto method");
    }

    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
