package practice_and_repetition.patterns.singleton;

public class SingletonLazyObject {

    private static SingletonLazyObject instance;

    public static SingletonLazyObject getInstance() {
        if (instance == null) {
            instance = new SingletonLazyObject();
        }
        return instance;
    }

    public void show() {
        System.out.println("Hello, i'm an lazy instance");
    }
}
