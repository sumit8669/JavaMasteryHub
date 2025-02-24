package sumit.designpattern.SOLID;

import sumit.designpattern.SOLID.payment.services.BankTransfer;
import sumit.designpattern.SOLID.payment.services.CreditCard;
import sumit.designpattern.SOLID.processor.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor bt = new PaymentProcessor(new BankTransfer());
        bt.processPayment();

        PaymentProcessor cr = new PaymentProcessor(new CreditCard());
        cr.processPayment();
    }
}
