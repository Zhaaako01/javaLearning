package lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("---- Новая задача ----");

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("---- Новая задача ----");

        int index1 = Arrays.binarySearch(array1, 5);
        System.out.println(index1);
    }
}
