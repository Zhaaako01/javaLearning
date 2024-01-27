package lesson16;

public class StringMethods3 {
    public static void main(String[] args) {

        String s1 = "privet, ";
        String s2 = "drug";

        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        int a = 5;
        int b = 6;
        String s = "ok";
        System.out.println(a + b + s);
        System.out.println("" + a + b + s);

        String s3 = "hello";
        //К String-у вы int присвоить не сможете,
        //это ошибка компиляции
        //String s4 = a+8;

        String s5 = null;
        s5 += "ok";
        System.out.println(s5);

        String s6 = "PrIvEt";
        String s7 = s6.toLowerCase();
        System.out.println(s7);
        String s8 = s6.toUpperCase();
        System.out.println(s8);


    }
}
