package java8inaction.chapter5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TraderAndTransaction {

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

    // Listing 5.1
    @Test
    public void one() {
        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        System.out.println(tr2011);
    }

    // Listing 5.2
    @Test
    public void two() {
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(cities);
    }

    // Listing 5.3
    @Test
    public void three() {
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(traders);
    }

    // Listing 5.4
    @Test
    public void four() {
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);

        System.out.println(traderStr);
    }

    // Listing 5.5
    @Test
    public void five() {
        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader()
                        .getCity()
                        .equals("Milan"));
        System.out.println(milanBased);
    }

    // Listing 5.6
    @Test
    public void six() {
        transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    // Listing 5.7
    @Test
    public void seven() {
        Optional<Integer> highestValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(highestValue);
    }

    // Listing 5.8
    @Test
    public void eight() {
        Optional<Transaction> smallestValue = transactions.stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallestValue);
    }
}
