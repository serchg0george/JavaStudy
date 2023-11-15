package practiceAndRepetition.multithreading;

public class TestRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(showText());
        }
    }

    public String showText() {
        return "Hey, we have runnable interface here :)";
    }
}
