package lesson16;

public class StringAdditionalMethods {
    public static void main(String[] args) {
        String s1 = "privet";
        //искать пробелы и tab-ы
        System.out.println(s1.isBlank());
        String s2 = "    ";
        System.out.println(s2.isBlank());

        String s3 = " ";
        System.out.println(s3.isEmpty());

        //Методы strip,stripLeading,stripTrailing работает как и trim, но лучше
        String s4 = "     privet        ";
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());
        System.out.println(s4.stripTrailing());

    }
}
