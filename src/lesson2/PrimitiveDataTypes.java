package lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = -128;
        byte b3 = 127;

        short s1 = 5;
        short s2 = -32768;
        short s3 = 32767;

        int i1 = 500;
        int i2 = 2147483647;

        long l1 = 1000000000000000000L;
        long l2 = 2147483648L;
        long l3 = 24L;

        float f1 = 3.14F;
        float f2 = 2.5f;
        float f3 = 20f;

        double d1 = 5.5;
        double d2 = 87.65;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 300;
        char c6 = 500; // 10 система исчесления

        char c7 = '\u03AB'; // 16 ABCDEF -  16 система исчесления

        boolean bool1 = true;
        boolean bool2 = false;


        int a1 = 60;

        int a2 = 0B111100;
        int a3 = 0b111100;

        int a4 = 0_74;

        int a5 = 0x3c;
        int a6 = 0X3C;

        int a7 = 1_000_000_000;

        System.out.println(a4);
    }
}
