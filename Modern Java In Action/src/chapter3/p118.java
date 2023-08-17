package chapter3;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class p118 {
    public static void main(String[] args) {
//        BiPredicate<List<String>, String> contains = List::contains;
        Supplier<Apple> sup = Apple::new;
        Apple a = sup.get();
        System.out.println(a.weight);

        Function<Integer, Apple> func = Apple::new;
        Apple b = func.apply(120);
        System.out.println(b.weight);
    }
}
