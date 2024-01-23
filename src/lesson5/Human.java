package lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
        System.out.println("Imya: " + name + " cvet mashini: " + car.colour + " balans bank. sheta" + bA.balance);
    }
}


class Car3 {
    Car3(String c, String e) {
        colour = c;
        engine = e;
    }

    String colour;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}
