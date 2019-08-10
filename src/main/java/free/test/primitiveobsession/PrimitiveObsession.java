package free.test.primitiveobsession;

public class PrimitiveObsession {
    public static void main(String[] args) {
        Integer[] cityPopulations = {
                13000000, // London
                21903623, // New York
                12570000, // Tokyo
                1932763, // Stockholm
                1605602, // Barcelona
                4119190 // Sydney
        };

        for (Integer cityPop : cityPopulations) {
            System.out.println(cityPop);
        }
    }
}
