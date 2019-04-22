package free.javase;

public class InstanceOfExample {
    public static void main(String[] args) {
        Object stringObj = "Top goal";
        Object integerObj = 2019;

        if (integerObj instanceof Integer) {
            System.out.println("integerObj is Integer");
        } else if (integerObj instanceof String) {
            System.out.println("integerObj is Integer");
        }

        if (stringObj instanceof Integer) {
            System.out.println("stringObj is String");
        } else if (stringObj instanceof String) {
            System.out.println("stringObj is String");
        }
    }
}
