package coderstea;

public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<Integer> printAgeConsumer = new java.util.function.Consumer<Integer>() {
            @Override
            public void accept(Integer age) {
                System.out.println("Age is " + age);
            }
        };
        printAgeConsumer.accept(23);

        java.util.function.Consumer<Integer> printAgeWithLambda = (age) -> System.out.println("Lambda: Age is " + age);
        printAgeWithLambda.accept(223);

        printAgeConsumer
                .andThen(printAgeWithLambda)
                .andThen(age -> System.out.println("How old is he/she " + age))
                .accept(66);
    }


}
