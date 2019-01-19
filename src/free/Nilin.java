package free;

import java.math.BigDecimal;

public class Nilin {

    public static void main(String[] args) {

        BigDecimal a = BigDecimal.valueOf(0.0);

        BigDecimal b = BigDecimal.valueOf(0.00);

        boolean equalsA = a.equals(b);
        System.out.println("equals A " + equalsA);
        boolean equalsB = b.equals(a);
        System.out.println("equals B " + equalsB);

        int compareA = a.compareTo(b);
        System.out.println("compare A " + compareA);

        int compareB = b.compareTo(a);
        System.out.println("compare B " + compareB);

        int a1 = a.hashCode();
        System.out.println("hashcode A " + a1);
        int b1 = b.hashCode();
        System.out.println("hashcode B " + b1);
    }
}
