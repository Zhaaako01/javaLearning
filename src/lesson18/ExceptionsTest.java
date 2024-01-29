package lesson18;

public class ExceptionsTest {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        //array[3] = 5; // ArrayIndexOutOfBoundsException

        int[][] array2 = new int[3][]; // ==>такой двумерный массив array2{ {},{},{} }

        //System.out.println(array2[0][1]); // NullPointerException


    }
}
