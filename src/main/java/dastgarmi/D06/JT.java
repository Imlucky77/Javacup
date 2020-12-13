package dastgarmi.D06;

import java.util.Arrays;

public class JT {
    static final Help help = new Help();

    public static void main(String[] args) {
        Arrays.asList(new Operation(1), new Operation(2), new Operation(3))
                .forEach(Operation::start);
    }
}
