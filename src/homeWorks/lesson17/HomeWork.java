package homeWorks.lesson17;

public class HomeWork {

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result;
        if (sb1.subSequence(0, sb1.length()).equals(sb2.subSequence(0, sb2.length()))) {
            result = true;
        } else result = false;
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb10 = new StringBuilder("Hello");
        StringBuilder sb20 = new StringBuilder("hello");
        StringBuilder sb30 = sb10;
        System.out.println(ravenstvo(sb10,sb20));
        System.out.println(ravenstvo(sb10,sb30));
        System.out.println(sb10==sb20);
        System.out.println(ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(ravenstvo(new StringBuilder(), new StringBuilder()));
    }
}
