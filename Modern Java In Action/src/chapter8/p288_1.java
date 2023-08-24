package chapter8;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class p288_1 {
    public static void main(String[] args) {
        Map<String, String> family = Map.ofEntries(
                entry("Teo","Star Wars"),
                entry("Christina","James Bond")
        );

        Map<String, String> friends = Map.ofEntries(
                entry("Raphael","Star Wars"),
                entry("Christina","Matrix")
        );


        Map<String, String> everyone = new HashMap<>(family);

        friends.forEach((k,v) -> everyone.merge(k, v, (m1,m2) -> (m1+"&"+m2)));
        System.out.println(everyone);
    }
}
