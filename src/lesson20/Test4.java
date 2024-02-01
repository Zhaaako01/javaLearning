package lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("poka"));
        list1.add(new StringBuilder("privet"));
        list1.add(new StringBuilder("okay"));
        list1.add(1, new StringBuilder("hello"));

        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        list1.addAll(list2);

        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        list2.get(1).append("!");
        System.out.println();
        for (StringBuilder s : list2) {
            System.out.print(s + " ");
        }
        System.out.println();
        list1.clear();
        System.out.println();
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
    }
}
