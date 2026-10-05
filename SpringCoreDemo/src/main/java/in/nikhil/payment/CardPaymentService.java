package in.nikhil.payment;

import in.nikhil.payment.interfaces.PaymentService;

public class CardPaymentService implements PaymentService {
    public void pay() {
        System.out.println("Payment done using card");
    }
}
