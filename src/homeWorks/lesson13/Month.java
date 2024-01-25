package homeWorks.lesson13;

public class Month {
    static void monthNum(int numOfMonth) {
        switch (numOfMonth) {
            case 1:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 2:
                System.out.println("В " + numOfMonth + " месяце 28 дней");
                break;
            case 3:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 4:
                System.out.println("В " + numOfMonth + " месяце 30 дней");
                break;
            case 5:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 6:
                System.out.println("В " + numOfMonth + " месяце 30 дней");
                break;
            case 7:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 8:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 9:
                System.out.println("В " + numOfMonth + " месяце 30 дней");
                break;
            case 10:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            case 11:
                System.out.println("В " + numOfMonth + " месяце 30 дней");
                break;
            case 12:
                System.out.println("В " + numOfMonth + " месяце 31 дней");
                break;
            default:
                System.out.println("Такого месяца в году нет");
        }
    }

    public static void main(String[] args) {
        monthNum(8);
    }
}
