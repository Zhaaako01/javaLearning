package homeWorks.lesson22;

public class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}
