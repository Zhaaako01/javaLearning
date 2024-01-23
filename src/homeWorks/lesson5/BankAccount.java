package homeWorks.lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(double summa) {
        balance += summa;
        return balance;
    }

    double snyatieSoScheta(double summa) {
        balance -= summa;
        return balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Zaur";
        myAccount.balance = 120.35;

        yourAccount.id = 2;
        yourAccount.name = "Mike";
        yourAccount.balance = 200.00;

        hisAccount.id = 3;
        hisAccount.name = "Ivan";
        hisAccount.balance = 1240.12;

        System.out.println(myAccount.snyatieSoScheta(50));
        System.out.println(yourAccount.popolnenieScheta(404.4));
        System.out.println(hisAccount.snyatieSoScheta(1550));
    }
}
