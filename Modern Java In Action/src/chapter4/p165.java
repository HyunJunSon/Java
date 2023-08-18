package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p165 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = lst.stream().map(n -> n*n).collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}
