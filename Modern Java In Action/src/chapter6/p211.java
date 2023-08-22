package chapter6;

import chapter5.Trader;
import chapter5.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class p211 {

    public enum Group{
        HIGH, MIDDLE, LOW
    }
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        Map<Group, List<Transaction>> map =
                transactions.stream().collect(groupingBy(
                   t -> {
                       if (t.getValue() > 900) return Group.HIGH;
                       else if (t.getValue() >= 700) return Group.MIDDLE;
                       else return Group.LOW;
                   }
                ));

        map.forEach((gr, lst) -> System.out.println(gr+" " + lst));
    }
}
