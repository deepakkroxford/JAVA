package Java_8_feature.T6_TypesOFFunctionalInterface;

import java.util.function.Consumer;

class Movie{
    String name;
    Movie(String name)
    {
        this.name = name;
    }
}
public class T3_Consumer {
    public static void main(String[] args) {
        Consumer<Integer> display = a -> System.out.println(a);
        // Implement display using accept()
        display.accept(10);

        Consumer<String> length = b->System.out.println(b);
        length.accept("aman");

        Consumer<Movie>c1 = m->System.out.println(m.name+ " ready to release ");
        Consumer<Movie>c2 = m->System.out.println(m.name+" relese but it is bigger flop ");
        Consumer<Movie>c3 = m->System.out.println(m.name+" storing information in data");
        Consumer<Movie>cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("Boss");
        cc.accept(m);


    }
}
