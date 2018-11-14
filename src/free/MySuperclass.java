package free;

import java.text.NumberFormat;

// Superclass
public class MySuperclass {

    // Superclass' instance variable:
    String myString;

    // Superclass' default (empty) constructor:
    MySuperclass() {
    }

    // Superclass' parameterized constructor:
    MySuperclass(String myString) {
        // Initialize instance variable
        this.myString = myString;
    }
}

// Subclass
class MySubclass extends MySuperclass {
    MySubclass(String myString) {
        // A behind-the-scenes implicit call to the
        // superclass' default constructor happens

        // Subclass can now initialize superclass instance variable:
        this.myString = myString;
    }

    public static void main(String[] args) {
        MySuperclass s1 = new MySubclass("Hello, World!");
        System.out.println(s1.myString);
        MySubclass s2 = new MySubclass("Hello, World.");
        System.out.println(s2.myString);
    }
}

