package howtoprogram.Chapter05.examples;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy(100, "Toyota", "NJ");
        AutoPolicy autoPolicy2 = new AutoPolicy(101, "porsche", "PA");
        AutoPolicy autoPolicy3 = new AutoPolicy(102, "benz", "Nh");


        policyInNoFaultState(autoPolicy1);
        policyInNoFaultState(autoPolicy2);
        policyInNoFaultState(autoPolicy3);
    }

    public static void policyInNoFaultState(AutoPolicy policy) {

        System.out.println("The Auto Policy: ");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                policy.isNoFaultState() ? "is" : "is not");
    }
}
