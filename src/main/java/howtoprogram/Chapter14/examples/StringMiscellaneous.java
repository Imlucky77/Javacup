package howtoprogram.Chapter14.examples;

/**
 * @author imlucky
 * @Created: 2019/03/10
 * @Examples: Fig. 14.2: StringMiscellaneous.java
 */
public class StringMiscellaneous {
    public static void main(String[] args) {
        String s = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s: %s", s);
        System.out.printf("%nLength of s: %d ", s.length());

        System.out.printf("%nThe string reversed is: ");

        for (int count = s.length() - 1; count >= 0; count--) {
            System.out.printf("%c ", s.charAt(count));
        }
        s.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");

        for (char character : charArray) {
            System.out.print(character);
        }
        System.out.println();
    }
}
