package lesson19;

public class Test8 {
    public static void main(String[] args) {
        //поменять все элементы массива
        String[] array = {"privet", "poka", "ok"};

        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        for (String s : array) {
            s = new String("Hello");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
