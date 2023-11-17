package practice_and_repetition.patterns.abstract_factory;

import practice_and_repetition.patterns.abstract_factory.guitar_factories.GibsonGuitarFactory;
import practice_and_repetition.patterns.abstract_factory.guitar_factories.GuitarBodyFactory;
import practice_and_repetition.patterns.abstract_factory.guitar_factories.LesPaulGuitarFactory;
import practice_and_repetition.patterns.abstract_factory.guitar_factories.YamahaGuitarFactory;

public class ShowCreatedGuitarBodies {
    private static CreateGuitarBodies configuration(Enum<Manufacturer> manufacturer) {
        CreateGuitarBodies guitarBody;
        GuitarBodyFactory factory;
        if (manufacturer.equals(Manufacturer.LES_PAUL)) {
            factory = new LesPaulGuitarFactory();
        } else if (manufacturer.equals(Manufacturer.YAMAHA)) {
            factory = new YamahaGuitarFactory();
        } else {
            factory = new GibsonGuitarFactory();
        }
        guitarBody = new CreateGuitarBodies(factory);
        return guitarBody;
    }

    public static void main(String[] args) {
        CreateGuitarBodies createGibson = configuration(Manufacturer.GIBSON);
        CreateGuitarBodies createLesPaul = configuration(Manufacturer.LES_PAUL);
        CreateGuitarBodies createYamaha = configuration(Manufacturer.YAMAHA);

        createGibson.showGuitarBody();
        createLesPaul.showGuitarBody();
        createYamaha.showGuitarBody();
    }

}
