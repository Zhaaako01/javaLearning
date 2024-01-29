package lesson18;

public class AdditionalStr_StrBldr {
    public static void main(String[] args) {
        char[] array = new char[]{'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello World");
        char[] array1 = new char[]{'p', 'r', 'i', 'v', 'e', 't'};
        sb.append(array1, 2, 3);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello World");
        char[] array2 = {'p', 'r', 'i', 'v', 'e', 't'};
        sb2.insert(2,array2,1,3);
        System.out.println(sb2);
    }
}
