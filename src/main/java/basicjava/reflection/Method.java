package basicjava.reflection;

public class Method {
    public int f1(Object p, int x) throws NullPointerException {
        if (p == null) {
            throw new NullPointerException();
        }
        return x;
    }

    public static void main(String[] args) {
        try {

            Class cls = Class.forName("basicjava.reflection.Method");
            java.lang.reflect.Method methlist[] = cls.getDeclaredMethods();
            for (int i = 0; i < methlist.length; i++) {
                java.lang.reflect.Method method = methlist[i];
                System.out.println("name = " + method.getName());
                System.out.println("decl1 name = " + method.getDeclaringClass());
                Class[] types = method.getParameterTypes();
                for (int j = 0; j < types.length; j++) {
                    System.out.println("param # " + j + " " + types[j]);
                }
                Class ec[] = method.getExceptionTypes();
                for (int k = 0; k < ec.length; k++) {
                    System.out.println("excep " + k + " " + ec[k]);
                }
                System.out.println("return type = " + method.getReturnType());
                System.out.println("-----------------------");
            }
        } catch (
                Throwable e) {
            System.out.println(e);
        }
    }
}
