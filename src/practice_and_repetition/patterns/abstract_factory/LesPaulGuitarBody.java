package practice_and_repetition.patterns.abstract_factory;

public class LesPaulGuitarBody implements GuitarBody {
    @Override
    public void createBody() {
        System.out.println("Hey, i'm a Les Paul guitar body!");
    }
}
