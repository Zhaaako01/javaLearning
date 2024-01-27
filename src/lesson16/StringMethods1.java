package lesson16;

public class StringMethods1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("vet"); //до первого совпадения
        System.out.println(i2);

        int i3 = s1.indexOf("z"); //если такого нет всегда ответ будет -1
        System.out.println(i3);

        //начиная с пятого индекса s2 искать на каком индексе находится а
        int i4 = s2.indexOf('a', 5);
        System.out.println(i4);

        // b1 начинается с abc? ответ false
        boolean b1 = s1.startsWith("a");
        System.out.println(b1);

        // String s1 начиная с 7 индекса начинается с abc? ответ true
        boolean b2 = s2.startsWith("abc", 7);
        System.out.println(b2);

        // b3 заканчивается с abc? ответ false
        boolean b3 = s2.endsWith("abc");
        System.out.println(b3);

        //не один из вызванных методов не поменял ни s1 ни s2
        // потому что String - immutable
        System.out.println(s1);
        System.out.println(s2);
    }
}
