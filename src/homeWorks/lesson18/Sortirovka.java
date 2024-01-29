package homeWorks.lesson18;

public class Sortirovka {
    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = minElement;
                array[index] = a;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        sortirovka(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
