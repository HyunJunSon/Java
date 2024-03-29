package chapter5;

import java.util.Arrays;
import java.util.List;

public class 문제8 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        Transaction transaction = new Transaction(alan, 2012, 950);
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                transaction
        );

        int a = transactions.stream().map(Transaction::getValue).reduce(Integer::min).orElse(null);
        System.out.println("최소값:"+ a);
    }
}
