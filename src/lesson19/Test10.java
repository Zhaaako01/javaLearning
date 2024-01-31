package lesson19;

public class Test10 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
        for (int b:array){
            b=b*10;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
