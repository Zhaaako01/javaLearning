package lesson18;

public class Test3 {
    public static void main(String[] args) {
        String[] array1;
        int[][] array2;

        array1 = new String[3];
        array2 = new int[3][];

        //динамическая инициализация одномерного массива
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
        }

        System.out.println("------------------------------");

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        // динамическая инициализацая двумерного массива
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
    }
}
