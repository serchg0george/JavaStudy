package practice_and_repetition.multithreading;

public class TestExtendThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(showText());
        }
    }

    public String showText() {
        return "Hey, we have thread class here :)";
    }
}
