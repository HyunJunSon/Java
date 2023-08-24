package chapter8;

import java.util.HashMap;
import java.util.Map;

public class p287 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(){{
            put("Rapahel","Star Wars");
            put("Olivia","James Bond");
            put("KimTaeHee","Iris");
            put("WonBin","Azussi");
        }};

        map.replaceAll((name, movie) -> movie.toUpperCase());

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println(map);


    }
}
