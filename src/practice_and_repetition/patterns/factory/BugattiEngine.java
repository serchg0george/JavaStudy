package practice_and_repetition.patterns.factory;

public class BugattiEngine implements CarEngine {

    private final String name;

    private BugattiEngine(String name) {
        this.name = name;
    }

    public static BugattiEngine creteBugattti(String name) {
        return new BugattiEngine(name);
    }

    @Override
    public void showHorsePower() {
//        System.out.println("Hi from bugatti motors, horse power of our engine: 300!");
        System.out.println(name);
    }
}
