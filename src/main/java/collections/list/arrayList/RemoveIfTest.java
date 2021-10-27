package collections.list.arrayList;

import java.util.ArrayList;

public class RemoveIfTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("Ram");
        list.add("James");
        list.add("Daniel");
        list.add("Frank");
        list.add("Samuel");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ram");
        list2.add("James");
        list2.add("Frank");

        //list.removeIf(n -> n.charAt(0) == 'S');
        list2.retainAll(list);
/*
        for (String s : list) {
            System.out.println(s);
        }*/
        System.out.println("Content of list " + list);
        System.out.println("Content of list2 " + list2);
    }
}
