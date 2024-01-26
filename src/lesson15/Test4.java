package lesson15;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;
        while (a++ < 10) {  // 5<10? true потом a++ и только потом заходим в {}
                            //даже после того как 11<10? false, a++ сработает
            //++a; // a= 6
            a++;
        }
        System.out.println(a);   //++a;       ==>  a = 6
                                 // a++;      ==>  a = 10
                                 //(a++ < 10) ==>  a = 12
    }
}
