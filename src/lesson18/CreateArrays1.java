package lesson18;

public class CreateArrays1 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 0, -2, 5};
        String[] array2 = {"privet", "poka", "ok"};
        int[][] array3 = {{0, 1, 5}, {-7, 3, 3}, {5, -1, 3}};

        System.out.println(array1[1]);
        array1[1]=10;
        System.out.println(array1[1]);
        System.out.println(array2[0]);
        System.out.println(array3[1][2]);
    }
}
