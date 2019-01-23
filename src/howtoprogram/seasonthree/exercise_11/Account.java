package howtoprogram.seasonthree.exercise_11;

public class Account {

    private double balance;
    private double amount;

    public Account(double balance) {
        if (balance > 0.0)
            this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0.0) {
             balance -= amount;
        } if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
        //return balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

}
