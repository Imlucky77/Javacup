package quera.match;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class RepeatInString {
    public int stringInString(String one, String two) {
        int count = StringUtils.countMatches(one, two);
        return count;
    }

    public static void main(String[] args) {
        RepeatInString rIs = new RepeatInString();
        Scanner input = new Scanner(System.in);
        System.out.print("please enter one String: ");
        String one = input.nextLine();
        System.out.print("please enter two String: ");
        String two = input.nextLine();
        System.out.println(rIs.stringInString(one, two));

    }
}
