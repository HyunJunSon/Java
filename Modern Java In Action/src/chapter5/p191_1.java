package chapter5;

import java.util.stream.Stream;

public class p191_1 {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, arr-> new int[]{arr[1], arr[0]+arr[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach(System.out::println);
//                .forEach(t -> System.out.println("("+ t[0]+"," + t[1] + ")"));
    }
}
