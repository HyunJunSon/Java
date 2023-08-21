package chapter5;

import java.util.stream.IntStream;

public class p192 {
    public static void main(String[] args) {
//        IntStream.iterate(0, n -> n<100, n -> n+4)
//                .forEach(System.out::println);

        IntStream.iterate(0, n->n+4)
                .takeWhile(n -> n<100)
                .forEach(System.out::println);
    }
}
