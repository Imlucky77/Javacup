package basicjava.generics;

public class GenericClass<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        GenericClass<String> stringGenericClass = new GenericClass<>();

        integerGenericClass.add(10);
        stringGenericClass.add("Hello I can");

        System.out.println(integerGenericClass.getT());
        System.out.println(stringGenericClass.getT());
    }
}
