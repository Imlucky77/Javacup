package free.test;

public class MainApp {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();

        en.setName("vahid");
        en.setAge(26);

        System.out.println(en.getName());
        System.out.println(en.getAge());
    }
}
