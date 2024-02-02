package lesson22.p1;
import lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek chelovek1= new Chelovek("male");
        //chelovek1.setName("Kolya");
        chelovek1.setVozrast(15);
        chelovek1.setVes(50);
        System.out.println(chelovek1.getName());
        System.out.println(chelovek1.getVozrast());
        System.out.println(chelovek1.getVes());
    }
}
