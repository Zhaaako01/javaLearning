package homeWorks.lesson18;

public class ShowArray {
    public static void showArray(String[][] strArray) {
        System.out.print("{");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print("{");
            for (int j = 0; j < strArray[i].length; j++) {
                if(j != strArray[i].length -1){
                    System.out.print(strArray[i][j] + ",");
                }else {
                    System.out.print(strArray[i][j]);
                }
            }
            if (i != strArray.length -1){
                System.out.print("},");
            } else {
                System.out.print("}");
            }

        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        String[][] strings = {{"one", "two"}, {"three"}, {"four", "five"}, {"four", "five","six"}};
        System.out.println(strings);
        showArray(strings);
    }
}
