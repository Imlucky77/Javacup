package free.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaJavacup {
    public static void main(String[] args) {
        /*int[] arrays = {1, 2, 3, 4, 100, 7, 250, 6, -2};
        Arrays.stream(arrays).parallel().forEach(System.out::println);*/

        List<Student> list = new ArrayList<>();
        list.add(1, new Student("ali", 27));
        list.add(2, new Student("saeed", 30));
        list.add(3, new Student("majid", 29));
        list.add(4, new Student("abbas", 36));
        list.add(5, new Student("reza", 31));




    }
}
