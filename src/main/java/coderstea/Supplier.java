package coderstea;

public class Supplier {
    public static void main(String[] args) {
        java.util.function.Supplier<Double> randomSupplier = new java.util.function.Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        Double randomNumber = randomSupplier.get();
        System.out.println(randomNumber);

        java.util.function.Supplier<String> codersTeaUrl = () -> "https://coderstea.com";
        System.out.println(codersTeaUrl.get());


    }
}
