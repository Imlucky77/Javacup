package dastgarmi.D04;

class Child extends Parent {
    static int c = f();

    static {
        c = g();
    }

    {
        b = h();
    }

    int b = i();

    public Child() {
        b = j();
    }
}
