package lesson20;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        StringBuilder[] array = {sb2, sb3, sb3, sb3};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0] = new StringBuilder("!!!!");
        System.out.println(list);
    }
}
