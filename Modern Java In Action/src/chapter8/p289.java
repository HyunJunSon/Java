package chapter8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p289 {
    public static void main(String[] args) {
        Map<String, Integer> movies = new HashMap<>(){{
            put("JamesBond",20);
            put("Matrix",15);
            put("Harry Potter",5);
        }};

        movies.entrySet().removeIf(es -> es.getValue() < 10);
        System.out.println(movies);
    }
}
