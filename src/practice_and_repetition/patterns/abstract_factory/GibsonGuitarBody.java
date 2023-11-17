package practice_and_repetition.patterns.abstract_factory;

public class GibsonGuitarBody implements GuitarBody {
    @Override
    public void createBody() {
        System.out.println("Hey, i'm a Gibson guitar body!");
    }
}
