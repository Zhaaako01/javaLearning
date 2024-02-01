package homeWorks.lesson20;

import java.util.ArrayList;
import java.util.Collections;


public class HomeWork {
    public static ArrayList<String> abc(String... strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String str : strings) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }

        Collections.sort(result);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        abc("poka", "okay", "bye", "okay");
    }
}
