package chapter8;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class p288 {
    public static void main(String[] args) {
        Map<String, String> family = Map.ofEntries(
                entry("Teo","Star Wars"),
                entry("Christina","James Bond")
                );
        Map<String, String> friends = Map.ofEntries(
                entry("Raphael","Star Wars")
                );

        Map<String, String> everyone = new HashMap<>(family);
        everyone.putAll(friends);

        System.out.println(everyone);

    }
}
