package lesson16;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");

        //разница между == и метода equals() в String объектах
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        //разница между == и метода equals() в String pool-e
        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        //проверка оператора !=(не равно)
        System.out.println(s1 != s4);

        //разница между методом equals() и equalsIgnoreCase() в String объектах
        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equals(s11));
        System.out.println(s10.equalsIgnoreCase(s11));
    }
}
