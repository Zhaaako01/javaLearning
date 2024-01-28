package lesson17;

class Car {
}

public class MethodsOfStrBldr1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Good day!!!");

        System.out.println(sb1.length());
        System.out.println(sb1.charAt(5));
        System.out.println(sb1.indexOf(" "));

        //index of ! starting from index at 9
        System.out.println(sb1.indexOf("!", 9));

        String s = sb1.substring(5);
        System.out.println(s);
        String s2 = sb1.substring(5, 8);
        System.out.println(s2);

        System.out.println(sb1.subSequence(5, 8));

        sb1.append(22);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);
        sb1.append(sb1);
        System.out.println(sb1);
        sb1.append("Hello");
        System.out.println(sb1);
        sb1.append(new Car());
        System.out.println(sb1);
    }
}
