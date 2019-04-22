package howtoprogram.Chapter14.examples;

/**
 * @author imlucky
 * @Created: 2019/03/13
 * @Examples: Fig. 14.20: ValidateInput.java
 */
public class ValidateInput {
    public static boolean validateFirstName(String first) {
        return first.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String last) {
        return last.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }

    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validatePhone(String phone) {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }

    public static boolean validateZip(String code) {
        return code.matches("\\d{5}");
    }

    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
}
