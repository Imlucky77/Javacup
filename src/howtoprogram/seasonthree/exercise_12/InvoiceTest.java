package howtoprogram.seasonthree.exercise_12;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1", "sell book", 5, 6);

        System.out.println(invoice.getInvoiceAmount());
    }
}
