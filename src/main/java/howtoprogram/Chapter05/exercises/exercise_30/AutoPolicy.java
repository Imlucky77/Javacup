package howtoprogram.Chapter05.exercises.exercise_30;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String setState(String state) {
        String result = "";
        if (state.equals("CT") || state.equals("MA") || state.equals("ME") || state.equals("NH") || state.equals("NJ") || state.equals("NY") || state.equals("PA") || state.equals("VT")) {
            this.state = state;
            result = "OK";
        } else {
            System.out.println("Sorry, this state doesn't exist");
            this.state = "N/A";
        }
        return result;
    }

    public String getState() {
        return state;
    }

    public String isNoFaultState() {
        String noFaultState;

        // determine whether state has no-fault auto insurance
        switch (getState()) // get AutoPolicy object's state abbreviation
        {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = "Yes";
                break;
            case "N/A":
                noFaultState = "Uncertain";
                break;
            default:
                noFaultState = "No";
                break;
        }

        return noFaultState;
    }

}
