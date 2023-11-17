package practice_and_repetition.patterns.abstract_factory;

public class YamahaGuitarBody implements GuitarBody {
    @Override
    public void createBody() {
        System.out.println("Hey, i'm a Yamaha guitar body!");
    }
}
