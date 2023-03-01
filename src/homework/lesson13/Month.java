package homework.lesson13;

public class Month {
    void setNumberOfMonth(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1:
                System.out.println("January, 31 day");
                break;
            case 2:
                System.out.println("February, 28 day");
                break;
            case 3:
                System.out.println("March, 31 day");
                break;
            case 4:
                System.out.println("April, 30 day");
                break;
            case 5:
                System.out.println("May, 31 day");
                break;
            case 6:
                System.out.println("June, 30 day");
                break;
            case 7:
                System.out.println("July, 31 day");
                break;
            case 8:
                System.out.println("August, 31 day");
                break;
            case 9:
                System.out.println("September, 30 day");
                break;
            case 10:
                System.out.println("October, 31 day");
                break;
            case 11:
                System.out.println("November, 30 day");
                break;
            case 12:
                System.out.println("December, 31 day");
                break;
            default:
                System.out.println("Dude, we have just twelve months");
        }
    }
}
