package lesson16;

public class Test5 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Urrraaa!!!";
        String s3 = s1.concat(s2).trim().replace("Urrraaa", "УРА").substring(6, 10);
        System.out.println(s3);
    }
}
