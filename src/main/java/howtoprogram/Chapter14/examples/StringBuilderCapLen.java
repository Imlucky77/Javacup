package howtoprogram.Chapter14.examples;

/**
 * @author imlucky
 * @Created: 2019/03/12
 * @Examples: Fig. 14.11: StringBuilderCapLen.java
 */
public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello, How are you?");

        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n",
                builder.toString(), builder.length(), builder.capacity());

        builder.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", builder.capacity());

        builder.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n",
                builder.length(), builder.toString());
    }
}
