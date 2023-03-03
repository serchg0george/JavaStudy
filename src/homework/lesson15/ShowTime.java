package homework.lesson15;

public class ShowTime {

    public static void showTime() {
        int hours = 0;
        OUTER:
        while (hours < 6) {
            int minutes = -1;
            MIDDLE:
            do {
                minutes++;

                if (hours > 1 && minutes % 10 == 0) {
                    break OUTER;
                }

                int seconds = 0;
                INNER:
                while (seconds < 60) {

                    if (seconds * hours > minutes) {
                        continue MIDDLE;
                    }

                    System.out.println("Time is " + hours + " : " + minutes + " : " + seconds);
                    seconds++;
                }

            }
            while (minutes < 59);
            hours++;
        }

    }
}
