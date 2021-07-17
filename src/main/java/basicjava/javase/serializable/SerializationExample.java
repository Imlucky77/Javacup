package basicjava.javase.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1, "ali", "daba");

        FileOutputStream fos = new FileOutputStream("./f.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.close();

        System.out.println("success");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./f.txt"));

        Student so = (Student) ois.readObject();
        System.out.println(so.getId() + " " + so.getName() + " " + so.getFamily());
        ois.close();
    }

}
