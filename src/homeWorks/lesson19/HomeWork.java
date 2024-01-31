package homeWorks.lesson19;

public class HomeWork {
    public static String[] abc(String[]... arrays) {
        int length = 0;
        for (String[] array1 : arrays) {
            length = array1.length;
        }
        String[] result = new String[length];
        int count = 0;
        for (String[] strAr : arrays) {
            for (String s : strAr) {
                result[count] = s;
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] newArray = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "blue"});
        for (String s : args) {
            for (int i = 0; i < newArray.length; i++) {
                if (s.equals(newArray[i])) {
                    newArray[i] = null;
                }
            }
        }
        for (String s : newArray) {
            System.out.print(s + " ");
        }
    }
}
