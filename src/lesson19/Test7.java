package lesson19;

public class Test7 {
    public static void main(String[] args) {
        //поменять все элементы массива
        int[] array = {0, 6, 4, 1};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 3;
//        }

        for(int i : array){
            i=3;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
