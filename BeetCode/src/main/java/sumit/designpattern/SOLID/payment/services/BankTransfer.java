package sumit.designpattern.SOLID.payment.services;

import sumit.designpattern.SOLID.payment.model.Payment;

public class BankTransfer implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing Bank Transfer payment...");
    }
}
