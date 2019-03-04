package howtoprogram.Chapter08.examples;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author imlucky
 * @Created: 2019/03/03
 * @Examples: Fig. 8.16: Interest.java
 */
public class Interest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            System.out.printf("%4d%20s%n",
                    year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
