package homeWorks.lesson14;

public class Time {
    static void showTime() {
        hour_loop:
        for (int hour = 0; hour < 6; hour++) {
            minute_loop:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break hour_loop;
                }
                second_loop:
                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) {
                        continue minute_loop;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
