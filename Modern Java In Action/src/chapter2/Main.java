package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        prettyPrintApple(Arrays.asList(
                new Apple("blue",170),
                new Apple("red",120)), new AppleFancyFormatter()
                );
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}

