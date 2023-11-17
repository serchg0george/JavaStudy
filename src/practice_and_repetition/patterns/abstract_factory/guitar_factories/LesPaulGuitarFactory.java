package practice_and_repetition.patterns.abstract_factory.guitar_factories;

import practice_and_repetition.patterns.abstract_factory.GuitarBody;
import practice_and_repetition.patterns.abstract_factory.LesPaulGuitarBody;

public class LesPaulGuitarFactory implements GuitarBodyFactory {
    @Override
    public GuitarBody createGuitarBody() {
        return new LesPaulGuitarBody();
    }
}