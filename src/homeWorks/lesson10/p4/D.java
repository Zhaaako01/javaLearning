package homeWorks.lesson10.p4;

import homeWorks.lesson10.p1.A;
import homeWorks.lesson10.p1.p2.*;
import homeWorks.lesson10.p1.p2.p3.C;
import homeWorks.lesson10.p4.p5.*;

import static homeWorks.lesson10.p1.p2.B.b1;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);

        System.out.println(b1);

    }
}
