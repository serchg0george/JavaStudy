package practice_and_repetition.multithreading;

public class ThreadsRun {
    public static void main(String[] args) {
        TestRunnable runnable = new TestRunnable();
        TestExtendThread thread = new TestExtendThread();
        Thread interfaceThread = new Thread(runnable);

        interfaceThread.start();
        thread.start();

    }
}
