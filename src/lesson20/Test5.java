package lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("poka"));
        list1.add(new StringBuilder("privet"));
        list1.add(new StringBuilder("okay"));
        list1.add(new StringBuilder("hello"));
//        for (StringBuilder s : list1) {
//            System.out.print(s + " ");
//        }
        System.out.println(list1.toString());
        System.out.println(list1.indexOf(new StringBuilder("poka")));
    }
}
