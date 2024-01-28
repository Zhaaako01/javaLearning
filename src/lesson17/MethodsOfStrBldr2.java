package lesson17;

public class MethodsOfStrBldr2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Good day!!!");

        System.out.println(sb1.insert(4, "55"));
        System.out.println(sb1.insert(sb1.length(), "Hello"));
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello World");

        sb2.delete(3, 6);
        System.out.println(sb2);

        sb2.deleteCharAt(4);
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Vsem privet");
        sb3.replace(0,5,"Pete");
        System.out.println(sb3);
        System.out.println(sb3.capacity());

        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity());
    }
}
