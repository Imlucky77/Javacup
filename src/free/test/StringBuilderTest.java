package free.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBuilderTest {
    public static void main(String[] args) {
        String regex = ".*\\d.*";
        Pattern pattern = Pattern.compile(regex);
        String input = "TEST";
        Matcher matcher = pattern.matcher(input);
        boolean isMatch = matcher.matches();
        System.out.println(isMatch);
    }
}
