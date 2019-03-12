package howtoprogram.Chapter11.examples;

public class Test {
    public static void main(String[] args) {
        //System.out.println("\u00b0");

        String name = "geekss@for@geekss";
        String[] split = name.split("s", 0);
        for (String s : split) {
            System.out.println(s);
        }
    }
}
