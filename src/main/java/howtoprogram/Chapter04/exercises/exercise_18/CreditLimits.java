package howtoprogram.Chapter04.exercises.exercise_18;

/**
 * @author: imlucky
 * @Created: 2019/01/29
 * @Exercise: 4.18
 */
public class CreditLimits {
    private int accountNo;
    private int startBalance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;


    public void setAccountInfo(int accountNo, int startBalance, int totalCharges, int totalCredits, int creditLimit) {
        setAccountNo(accountNo);
        setStartBalance(startBalance);
        setTotalCharges(totalCharges);
        setTotalCredits(totalCredits);
        setCreditLimit(creditLimit);
    }

    public int getNewBalance() {
        return getStartBalance() - getTotalCharges() + getTotalCredits();
    }

    public boolean creditExceeded() {
        // cleanup code
        //return getNewBalance() <= getCreditLimit();
        return (getNewBalance() > getCreditLimit()) ? false : true;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}
