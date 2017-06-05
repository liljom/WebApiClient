package entities;

/**
 * Created by liljom on 2017. 05. 31..
 */
public class Invoice {

    private String customerName;
    private double amount;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
