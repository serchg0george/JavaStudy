package homework.lesson14;

public class ShowTime {
    public static void showTime() {
        for (int hours = 0; hours <= 23; hours++) {
            if (hours > 1) {
                System.out.println("The end");
                break;
            }
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (minutes % 10 == 0 && minutes != 0) {
                    break;
                }
                for (int seconds = 0; seconds <= 59; seconds++) {
                    if (seconds*hours > minutes) {
                        break;
                    }
                    System.out.println("Time is " + hours + " : " + minutes + " : " + seconds);
                }
            }
        }
    }
}
