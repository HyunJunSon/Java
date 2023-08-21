package chapter5;

import java.util.Arrays;
import java.util.stream.Stream;

public class p189 {
    public static void main(String[] args) {
        Stream<String> values =
                Stream.of("config","home","user")
                        .flatMap(key -> Stream.ofNullable(System.getProperty(key)));

        values.forEach(System.out::println);


        Arrays.stream(new int[]{2,3,5,7,9,10})
                .filter(x-> x%2 == 0)
                .forEach(System.out::println);
    }
}
