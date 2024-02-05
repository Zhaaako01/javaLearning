package lesson24;

public class Test5 {
}

interface I1 {
    void abc();
    default void def() {
        System.out.println("eto method def");
    }
}

class Z2 implements I1 {

    @Override
    public void abc() {
        System.out.println("eto method abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
    }
}
