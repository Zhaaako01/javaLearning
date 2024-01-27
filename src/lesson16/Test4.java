package lesson16;

public class Test4 {
    /*
Класс String представляет строки символов. Все строковые литералы в программах Java,
такие как «abc», реализованы как экземпляры этого класса. Строки постоянны; их значения
не могут быть изменены после их создания. Строковые буферы поддерживают изменяемые строки.
Поскольку объекты String неизменяемы, их можно использовать совместно.
     */
    public static void main(String[] args) {
        //For example:
        String str = "abc";

        //is equivalent to:
        char data[] = {'a', 'b', 'c'};
        //String str = new String(data);

    }
}
