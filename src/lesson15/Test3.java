package lesson15;

public class Test3 {
    public static void main(String[] args) {
        //выводи на экран числа с 1 до n, по интервалу +1, до тех пор пока число(int a) на цело
        // делится и 3 и на 7
        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
                //break; //тоже сработает
            }
            a++;
        }
    }
}
