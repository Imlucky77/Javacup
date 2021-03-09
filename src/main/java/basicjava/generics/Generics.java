package basicjava.generics;

public class Generics {
    public static <T> void genericMethod(T[] initArray) {
        for (T loop : initArray) {
            System.out.print(loop);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"A", "B", "C", "D", "E", "F"};
        Double[] doubleArray = {2.2, 3.6, 9.2, 8.4};

        System.out.println("نتجیه استفاده برای آرایه نوع Integer:");
        genericMethod(intArray);
        System.out.println("\nنتیجه متد برای آرایه نوع ِ Double:");
        genericMethod(stringArray);
        System.out.println("\n نتیجه متد برای ارایه نوع کاراکتری:");
        genericMethod(doubleArray);
    }

}
