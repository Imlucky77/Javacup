package designpatterns.structural.adapter;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        setBankName("Mellat");
        setAccHolderName("khashayar");
        setAccNumber(123456789);
    }

    @Override
    public String getCreditCard() {
        String bankName = getBankName();
        String accHoderName = getAccHolderName();
        long accNo = getAccNumber();

        return ("The Account number " + accNo + " of " + accHoderName + " in "
                + bankName + "bank is valid and authenticated for issuing the credit card. ");
    }
}
