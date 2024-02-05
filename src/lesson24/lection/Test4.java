package lesson24.lection;

public class Test4 {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {
    void jump();
}

interface A2 {
    void abc();
}

interface B2 extends A2, Jumpable {
    void def();
}
class AB2 implements B2{

    @Override
    public void jump() {

    }

    @Override
    public void abc() {

    }

    @Override
    public void def() {

    }
}
