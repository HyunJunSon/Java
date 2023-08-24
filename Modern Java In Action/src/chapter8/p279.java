package chapter8;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class p279 {
        public static void main(String[] args) {
            Set<String> set = Set.of("Raphael","Olivia","Thibaut","HyunJun");
            System.out.println(set);

            List<Integer> lst = List.of(1,2,3,4,5,6,7,8,9,10);
            System.out.println(lst);

            Map<Integer, String> map = Map.of(1,"hi",2,"hello",3,"안녕");
            System.out.println(map);

            Map<String, Integer> map2= Map.ofEntries(
                    entry("hi",1),
                    entry("hello",2),
                    entry("good",3),
                    entry("what",4)
            );

            System.out.println(map2);
        }
    }




