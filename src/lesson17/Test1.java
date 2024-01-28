package lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        System.out.println(sb2.capacity());
        StringBuilder sb4 = new StringBuilder(sb2);

    }
}
