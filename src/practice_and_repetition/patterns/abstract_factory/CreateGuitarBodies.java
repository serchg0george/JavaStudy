package practice_and_repetition.patterns.abstract_factory;

import practice_and_repetition.patterns.abstract_factory.guitar_factories.GuitarBodyFactory;

public class CreateGuitarBodies {
    private GuitarBody guitarBody;

    public CreateGuitarBodies(GuitarBodyFactory factory) {
        guitarBody = factory.createGuitarBody();
    }

    public void showGuitarBody() {
        guitarBody.createBody();
    }
}