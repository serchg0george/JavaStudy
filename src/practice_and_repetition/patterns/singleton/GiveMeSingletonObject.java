package practice_and_repetition.patterns.singleton;

public class GiveMeSingletonObject {

    public static void main(String[] args) {
        SingletonEarlyObject earlyInstance = SingletonEarlyObject.getInstance();
        SingletonLazyObject lazyInstance = SingletonLazyObject.getInstance();

        earlyInstance.show();
        lazyInstance.show();

    }

}
