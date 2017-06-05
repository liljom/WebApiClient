package logic.invoicing;

import entities.Invoice;

/**
 * Created by liljom on 2017. 06. 01..
 */
public class InvoicingUtil {

    public void doInvoice(Invoice invoice) {
        System.out.println("Invoice is created, and sent to " + invoice.getCustomerName() +
            " with an amount of " + invoice.getAmount());
    }
}
