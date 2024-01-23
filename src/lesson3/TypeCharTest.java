package lesson3;

public class TypeCharTest {
    public static void main(String[] args) {
        char c = 'a';
        int i = 10;
        int i2 = c;
        short s = 500;
        //char z =s; мы не можем присваивать short на char и наоборот
        System.out.println(i%c);
    }
}
