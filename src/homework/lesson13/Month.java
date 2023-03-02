package homework.lesson13;

public class Month {
    void setNumberOfMonth(int numberOfMonth) {
        switch (numberOfMonth) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 day");
                break;
            case 2:
                System.out.println("28 day");
                break;
            default:
                System.out.println("Dude, we have just twelve months");
        }
    }
}
