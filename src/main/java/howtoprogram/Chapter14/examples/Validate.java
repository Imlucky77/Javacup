package howtoprogram.Chapter14.examples;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/13
 * @Examples: Fig. 14.21: Validate.java
 */
public class Validate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first name: ");
        String firstname = input.nextLine();
        System.out.print("Please enter last name: ");
        String lastname = input.nextLine();
        System.out.print("Please enter address: ");
        String address = input.nextLine();
        System.out.print("Please enter city: ");
        String city = input.nextLine();
        System.out.print("Please enter zipcode: ");
        String zipcode = input.nextLine();
        System.out.print("Please enter phone: ");
        String phone = input.nextLine();
        System.out.print("Please enter state: ");
        String state = input.nextLine();

        System.out.println("Validate Result: ");

        if (!ValidateInput.validateFirstName(firstname)) {
            System.out.println("Invalid first name");
        }
        if (!ValidateInput.validateLastName(lastname)) {
            System.out.println("Invalid last name");
        }
        if (!ValidateInput.validateAddress(address)) {
            System.out.println("Invalid address");
        }
        if (!ValidateInput.validateCity(city)) {
            System.out.println("Invalid city");
        }
        if (!ValidateInput.validateZip(zipcode)) {
            System.out.println("Invalid zip code");
        }
        if (!ValidateInput.validatePhone(phone)) {
            System.out.println("Invalid phone");
        }
        if (!ValidateInput.validateState(state)) {
            System.out.println("Invalid state");
        } else {
            System.out.println("Valid input. Thank you! ");
        }
    }
}
