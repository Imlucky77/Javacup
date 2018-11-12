package free.interfaces;

public class MainInterface {
    public static void main(String[] args) {

        DefaultInterface df = new ClassExtends();
        df.defaultMethod();

        ClassExtends cx = new ClassExtends();
        cx.sameMethod();
    }
}
