package 문제21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Num {
    int[] arr;

    public Num(int[] arr) {
        this.arr = arr;
    }
    int[] view(boolean check) {
        IntStream ins;
        if (check) {
            ins = Arrays.stream(arr)
                         .filter(n -> n % 2 != 0);

        } else {
            ins = Arrays.stream(arr)
                    .filter(n -> n % 2 == 0);
        }

        return ins.toArray();

    }
}
