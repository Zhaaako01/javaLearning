package lesson19;

public class Test4 {
    public static void main(String[] args) {
        //сложить все элементы массива
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for (int i : array) {
            summa += i;
        }
        System.out.println(summa);
    }
}
