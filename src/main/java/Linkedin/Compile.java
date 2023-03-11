package Linkedin;
import java.util.ArrayList;
import java.util.List;
public class Compile {
        public static void main(String args[]) {
            List<String> obj = new ArrayList<>();
            obj.add("A");
            obj.add("B");
            obj.add("C");
            obj.add(1, "D");
            System.out.println(obj);
        }
}
