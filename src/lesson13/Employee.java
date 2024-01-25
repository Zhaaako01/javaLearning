package lesson13;

public class Employee {
    //Расмотрим дни недели когда и как работает наш работник
    public static void main(String[] args) {
        switch ("vtornik") {
            case "ponedelnik":

            case "vtornik":

            case "sreda":

            case "chetverg":

            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenye":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne suwestvuet");
        }
    }
}
