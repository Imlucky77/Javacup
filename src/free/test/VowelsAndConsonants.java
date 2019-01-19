package free.test;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String input = line.toLowerCase();

        for (int i = 0; i < input.length(); ++i) {
            char typeChar = input.charAt(i);
            if (typeChar == 'a' || typeChar == 'e' ||
                    typeChar == 'i' || typeChar == 'o' || typeChar == 'u') {
                ++vowels;
            } else if (typeChar >= 'a' && typeChar <= 'z') {
                ++consonants;
            } else if (typeChar >= '0' && typeChar <= '9') {
                ++digits;
            } else if (typeChar == ' ') {
                ++spaces;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
    }
}
