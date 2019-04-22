package howtoprogram.Chapter14.examples;

import java.util.Arrays;

/**
 * @author imlucky
 * @Created: 2019/03/13
 * @Examples: Fig. 14.23: RegexSubstitution.java
 */
public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "The sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.println("Original String 1: " + firstString);

        firstString = firstString.replaceAll("\\*", "^");

        System.out.println("^ substituted for *: " + firstString);

        firstString = firstString.replaceAll("stars", "carets");

        System.out.println("\"carets\" substituted for \"stars\":" + firstString);

        System.out.println("Every word replaced by \"word\": " + firstString.replaceAll("\\w+", "word"));
        System.out.println();
        System.out.println("Original String 2: " + secondString);

        for (int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }
        System.out.println("First 3 digits replaced by \"digit\": " + secondString);

        System.out.print("String split on commas: ");
        String[] results = secondString.split(",\\s*");
        System.out.println(Arrays.toString(results));
    }
}
