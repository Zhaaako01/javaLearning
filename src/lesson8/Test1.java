package lesson8;

public class Test1 {
    public final int a = 10;
    final public int b = 10;
    public final int c;

    Test1() {
        c = 10;
    }

    Test1(boolean v) {
        c = 15;
    }

    public void abc(short s) {
        final byte b = 10;
        System.out.println(s + b);

    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.a = t.a * 2;
        System.out.println(t.a);
    }
}
