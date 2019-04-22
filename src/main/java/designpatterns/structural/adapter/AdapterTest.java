package designpatterns.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {

        CreditCard targetInstance = new BankCustomer();
        targetInstance.giveBankDetails();
        System.out.println(targetInstance.getCreditCard());
    }
}
