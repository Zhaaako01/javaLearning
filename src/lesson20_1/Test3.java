package lesson20_1;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
//        al1.add(new Test3());
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object c : al1) {
            //System.out.println("number= " + c + " and lengt=" + c.toString().length());
            System.out.println("number= " + c + " and lengt=" + ((String) c).length());
        }
    }
}
