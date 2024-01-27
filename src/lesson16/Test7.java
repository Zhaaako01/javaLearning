package lesson16;

public class Test7 {

    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");

        //разница между == и метода equals() в String объектах
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
