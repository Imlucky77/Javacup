package free.test;

public class StaticSample {
    int a = 40;
    int rollno;
    String name;
    static String collage = "MIT";

    public StaticSample(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void change() {
        collage = "Islamic republic university";
        name = "jasem";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collage);
    }

    public static void main(String[] args) {
        StaticSample te = new StaticSample(1, "ali");
        StaticSample te1 = new StaticSample(2, "saeed");

        te.display();
        te1.display();
        StaticSample te2 = new StaticSample(3, "abood");
        te2.change();
        te2.display();

        StaticSample te3 = new StaticSample(4, "nilin");
        te3.display();
    }
}
