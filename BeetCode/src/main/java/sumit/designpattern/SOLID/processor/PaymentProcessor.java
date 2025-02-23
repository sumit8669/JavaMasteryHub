package sumit.designpattern.SOLID.processor;

import sumit.designpattern.SOLID.payment.model.Payment;

public class PaymentProcessor {
    private final Payment payment;

    public PaymentProcessor (Payment payment){
        this.payment = payment;
    }

    public void processPayment(){
        payment.pay();
    }
}
