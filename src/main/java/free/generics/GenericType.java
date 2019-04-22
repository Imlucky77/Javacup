package free.generics;

public class GenericType<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericType<String> gts = new GenericType<>();
        gts.setT("salam");

        GenericType gt = new GenericType();
        gt.setT("eyval");
        gt.setT(12);

    }
}
