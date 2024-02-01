package lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("poka");
        list1.add("privet");
        list1.add("okay");
        list1.add(1, "hello");
//        for (int i =0; i<list1.size(); i++){
//            System.out.println(list1.get(i));
//        }
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list1.get(3));

        //метод set,работает как replace
        list1.set(1, "!!!");
        for (String s : list1) {
            System.out.print(s + " ");
        }
    }
}
