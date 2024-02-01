package lesson20;

import java.util.ArrayList;

public class Test3 {
    //Пример где можно изменить элементы ArrayList-a без его методов
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.remove(sb1);
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

    }
}
