package dastgarmi.D13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionMethods {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("ir.javacup.MyClass");
        Constructor constructor = c.getConstructor(String.class);
        MyClass instance = (MyClass) constructor.newInstance("Naser");
        Field field = instance.getClass().getDeclaredField("name");
        field.set(instance, "Nader");
        System.out.println(instance.getName());
    }
}
