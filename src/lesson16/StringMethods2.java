package lesson16;

public class StringMethods2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        String s2 = new String("   abcdef    gabcd     ");
        String s3 = new String("privet");


        String s10 = s1.substring(3);
        System.out.println(s10);

        String s11 = s1.substring(3, 7);
        System.out.println(s11);

        String s12 = s2.trim();
        System.out.println(s2); // посмотреть до trim
        System.out.println(s12);

        String s13 = s3.replace('r','Z');
        System.out.println(s13);

        String s14 = s3.replace("vet", "vivka");
        System.out.println(s14);
    }
}
