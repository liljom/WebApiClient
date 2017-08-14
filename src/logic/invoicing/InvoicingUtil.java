package logic.invoicing;

import entities.Invoice;

public class InvoicingUtil {

    public void doInvoice(Invoice invoice) {
        System.out.println("Invoice is created, and sent to " + invoice.getCustomerName() +
            " with an amount of " + invoice.getAmount());
    }
}
