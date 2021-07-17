package basicjava.reflection;

public class Instance1 {
    public static void main(String args[]) {

        try {
            Class cls = Class.forName("basicjava.reflection.A");
            boolean integerInstance = cls.isInstance(new Integer(21));
            System.out.println(integerInstance);

            boolean objectInstance = cls.isInstance(new A());
            System.out.println(objectInstance);

        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}
