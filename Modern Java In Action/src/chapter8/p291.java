package chapter8;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class p291 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>(){{
           put("a",10L);
           put("b",20L);
           put("c",30L);
        }};
        long parallelismThreshold = 1;



//       map.search(parallelismThreshold, (st, l) ->l);
//
//        Optional<Long> maxValue =
//                Optional.ofNullable(map.reduceValues(parallelismThreshold, Long::max));
//        System.out.println(maxValue.get());
//
//        String st = map.reduceKeys(parallelismThreshold, (s1,s2) -> s1+" "+s2);
//        System.out.println(st);
//
//        Map.Entry<String, Long> entry = map.reduceEntries(parallelismThreshold, (e1, e2) -> e2);
//        System.out.println(entry);


    }
}
