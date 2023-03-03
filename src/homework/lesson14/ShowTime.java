package homework.lesson14;

public class ShowTime {
    public static void showTime() {
        for (int hours = 0; hours < 6; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                if ( hours > 1 && minutes % 10 == 0) {
                    break;
                }
                for (int seconds = 0; seconds < 60; seconds++) {
                    if (seconds * hours > minutes) {
                        continue;
                    }
                    System.out.println("Time is " + hours + " : " + minutes + " : " + seconds);
                }
            }
        }
    }
}
