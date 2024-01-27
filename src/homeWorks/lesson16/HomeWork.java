package homeWorks.lesson16;

public class HomeWork {
    public void email(String mail) {
        for (int i = 0; i < mail.length(); i++) {
            int indexAtt = mail.indexOf('@', i);
            int indexDot = mail.indexOf('.', i);
            i = mail.indexOf(';',i);
            System.out.println(mail.substring(indexAtt+1, indexDot));
        }
    }

    public static void main(String[] args) {
        HomeWork homeW = new HomeWork();
        homeW.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
