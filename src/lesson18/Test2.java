package lesson18;

public class Test2 {
    public static void main(String[] args) {
        double[][] array3;
        array3 = new double[4][2];

        double[] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;
        System.out.println(array3[1][0]);
        System.out.println(array3[1][1]);
    }
}
