package in.nikhil.payment;

import in.nikhil.payment.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class UpiPaymentService implements PaymentService {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
