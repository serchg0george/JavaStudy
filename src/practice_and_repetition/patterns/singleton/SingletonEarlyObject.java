package practice_and_repetition.patterns.singleton;

public class SingletonEarlyObject {
    private static final SingletonEarlyObject instance = new SingletonEarlyObject();

    private SingletonEarlyObject() {
    }

    public static SingletonEarlyObject getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("Hello, i'm an early instance");
    }
}
