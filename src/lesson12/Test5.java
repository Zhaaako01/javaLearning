package lesson12;

public class Test5 {
    public static void main(String[] args) {
        //int salary = 100;
        int salary = 300;

        if (salary < 200) {
            System.out.println("Z/P ochen nizka");
        } else if (salary < 400) {
            System.out.println("Z/P srednego razmera");
        } else if (salary < 600) {
            System.out.println("Z/P visokaya");
        } else {
            System.out.println("Z/P otlichnaya");
        }
    }
}
