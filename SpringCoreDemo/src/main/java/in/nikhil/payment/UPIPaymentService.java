package in.nikhil.payment;

import in.nikhil.payment.interfaces.PaymentService;

public class UPIPaymentService implements PaymentService {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
