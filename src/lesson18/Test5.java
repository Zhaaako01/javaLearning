package lesson18;

public class Test5 {
    /*Написать метод который принимает в параметр массив и выводит на экран
    его максимальный и минимальный элемент
     */
    public static void maxAndMinElement(double[] array) {
        double maxElement = array[0];
        double minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }

        }
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);
    }

    public static void main(String[] args) {
        double[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        double[] array2 = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxAndMinElement(array1);
        System.out.println("---- Новая задача ----");
        maxAndMinElement(array2);
        System.out.println("---- Новая задача ----");
        maxAndMinElement(new double[]{2.5, -1.3, 0, 5.7, -99.5, -99.7, 10.01,});
    }
}
