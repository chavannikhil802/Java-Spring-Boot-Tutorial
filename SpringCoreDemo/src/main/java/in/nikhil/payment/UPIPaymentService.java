package in.nikhil.payment;

import in.nikhil.payment.interfaces.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPIPaymentService implements PaymentService {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
