package howtoprogram.seasonthree.exercise_11;

import static java.lang.System.out;


/**
 * @author imlucky
 * Exercises 3.11 and 3.15
 */
public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account(120.2);
        Account account2 = new Account(-80);

        out.println(account1);
        out.println(account2);


        out.println(account1.deposit(20));
        account1.withdraw(50);
        account1.withdraw(70);
        out.println(account1);


    }
}
