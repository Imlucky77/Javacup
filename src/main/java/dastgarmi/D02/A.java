package dastgarmi.D02;

interface A {
    int MAX = 5;

    default int f() {
        return MAX + 2;
    }

    public static void main(String[] args) {
        Object[] objs = {"", new D(), null};
        int result = 0;
        for (Object obj : objs) {
            try {
                A test = obj instanceof B ? (B) obj : (A) obj;
                result += test.f();
            } catch (ClassCastException e) {
                result++;
            } catch (NullPointerException e) {
                result--;
            }
        }
        System.out.println(result);
    }
}
