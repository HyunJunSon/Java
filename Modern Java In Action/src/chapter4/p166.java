package chapter4;

import chapter2.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p166 {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1,2,3);
        List<Integer> arr2 = Arrays.asList(3,4);

        List<int[]> result = arr1.stream()
                .flatMap(i -> arr2.stream().map(m -> new int[]{i,m})).collect(Collectors.toList());


        System.out.println(result.get(0)[0]);

        List<int[]> result2 = arr1.stream()
                .flatMap(i -> arr2.stream()
                        .filter(j -> (i+j) % 3 == 0).map(j -> new int[]{i,j}))
                .collect(Collectors.toList());

        result2.forEach(arr -> {
                for(int a : arr){
                    System.out.println(a);
                }
            System.out.println();
        });



    }
}
