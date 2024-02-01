package lesson20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("hello"));

        System.out.println(list.toString());
        System.out.println(list.lastIndexOf(new String("poka")));
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
