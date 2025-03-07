package practice_and_repetition.patterns.factory;

public class CarEngineFactory {
    public CarEngine showEngine(Enum<Manufacturer> engine) {
        if (engine.equals(Manufacturer.BUGATTI)) {
            return BugattiEngine.creteBugattti("Factory car");
        } else if (engine.equals(Manufacturer.ALFA_ROMEO)) {
            return new AlfaRomeoEngine();
        } else if (engine.equals(Manufacturer.PORSCHE)) {
            return new PorscheEngine();
        } else {
            return null;
        }
    }
}
