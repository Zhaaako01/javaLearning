package lesson19;

public class Test9 {
    public static void main(String[] args) {
        //поменять все элементы массива
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array = {sb1, sb2, sb3};

        for (StringBuilder sb : array) {
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        for (StringBuilder sb : array) {
//            sb = new StringBuilder("Hello");
            sb.append(" java");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

