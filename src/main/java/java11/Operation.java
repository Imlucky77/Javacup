package java11;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Operation {
    private final String accNo;
    private final BigDecimal amount;

    public Operation(String accNo, BigDecimal amount) {
        this.accNo = accNo;
        this.amount = amount;
    }

    public String getAccNo() {
        return accNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        List<Operation> operations = Arrays.asList(
                new Operation("123", new BigDecimal("10")),
                new Operation("456", new BigDecimal("1200")),
                new Operation("123", new BigDecimal("-4")),
                new Operation("123", new BigDecimal("8")),
                new Operation("456", new BigDecimal("800")),
                new Operation("456", new BigDecimal("-1500")),
                new Operation("123", new BigDecimal("2")),
                new Operation("123", new BigDecimal("-6.5")),
                new Operation("456", new BigDecimal("-600"))
        );

        // without merge()
        HashMap<String, BigDecimal> balance = new HashMap<>();
        /*
        operations.forEach(op -> {
            String key = op.getAccNo();
            balanace.putIfAbsent(key, BigDecimal.ZERO);
            balanace.computeIfPresent(key, (accNo, prev) -> prev.add(op.getAmount()));
        });*/

        // with merge()
        /*operations.forEach(op -> balanace.merge(op.getAccNo(), op.getAmount(), (soFar, amount) -> soFar.add(amount)));*/

        // with merge() and method reference
        operations.forEach(op -> balance.merge(op.getAccNo(), op.getAmount(), BigDecimal::add));

        System.out.println(balance);
    }
}

