package practice_and_repetition.patterns.factory;

public class GiveMeMyEngines {
    public static void main(String[] args) {
        CarEngineFactory engineFactory = new CarEngineFactory();
        CarEngine bugatti = engineFactory.showEngine(Manufacturer.BUGATTI);
        CarEngine alfa_romeo = engineFactory.showEngine(Manufacturer.ALFA_ROMEO);
        CarEngine porsche = engineFactory.showEngine(Manufacturer.PORSCHE);

        bugatti.showHorsePower();
        alfa_romeo.showHorsePower();
        porsche.showHorsePower();
    }
}
