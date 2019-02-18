package howtoprogram.Chapter05.exercises.exercise_30;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.30
 */
public class AutoPolicyTest {

    public static void main(String[] args) {
        int accountNumber = 0;
        String makeAndModel = "";
        String state = "";

        Scanner input = new Scanner(System.in);
        while (accountNumber != -1) {
            System.out.print("Please enter the account number(Enter -1 to exit):");
            accountNumber = input.nextInt();
            if (accountNumber == -1)
                break;
            System.out.print("Please enter the model:");
            makeAndModel = input.next();

            AutoPolicy ap = new AutoPolicy(accountNumber, makeAndModel);

            System.out.print("Please enter the state name:");
            state = input.next();
            ap.setState(state);

            policyInNoFaultState(ap);
        }
    }

    // method that displays whether an AutoPolicy
    // is in a state with no-fault auto insurance
    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("Car insurance policy information:");
        System.out.printf("Client #: %d Model: %s State: %n%s Whether it is no-fault state: %s%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                policy.isNoFaultState());
    }
}
