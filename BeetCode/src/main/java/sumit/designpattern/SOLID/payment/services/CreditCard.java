package sumit.designpattern.SOLID.payment.services;

import sumit.designpattern.SOLID.payment.interfaces.Payable;
import sumit.designpattern.SOLID.payment.interfaces.Refundable;

//Each class follows SRP (one responsibility) and LSP (can be substituted safely).
public class CreditCard implements Payable, Refundable {

    @Override
    public void pay() {
        System.out.println("Processing Credit Card payment...");
    }

    @Override
    public void refund() {
        System.out.println("Processing Credit Card refund...");
    }
}
