package lesson20;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        Object[] array1 = list1.toArray();
        for (Object c : array1) {
            System.out.print(c + " ");
        }

        System.out.println();

        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
        for (StringBuilder c : array2) {
            System.out.print(c + " ");
        }
    }
}
