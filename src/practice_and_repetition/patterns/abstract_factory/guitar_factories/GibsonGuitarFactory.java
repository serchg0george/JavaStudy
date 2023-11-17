package practice_and_repetition.patterns.abstract_factory.guitar_factories;

import practice_and_repetition.patterns.abstract_factory.GibsonGuitarBody;
import practice_and_repetition.patterns.abstract_factory.GuitarBody;

public class GibsonGuitarFactory implements GuitarBodyFactory {
    @Override
    public GuitarBody createGuitarBody() {
        return new GibsonGuitarBody();
    }
}