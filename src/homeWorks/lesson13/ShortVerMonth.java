package homeWorks.lesson13;

public class ShortVerMonth {
    static void dayQuantity(int numOfMonth) {
        switch (numOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 2:
                System.out.println("В " + numOfMonth + " месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В " + numOfMonth + " месяце 30 дней");
                break;
            default:
                System.out.println("Такого месяца в году нет");
        }
    }

    public static void main(String[] args) {
        dayQuantity(6);
        Month.monthNum(7);
    }
}
