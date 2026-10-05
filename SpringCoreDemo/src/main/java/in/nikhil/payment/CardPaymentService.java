package in.nikhil.payment;

import in.nikhil.payment.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier
public class CardPaymentService implements PaymentService {
    public void pay() {
        System.out.println("Payment done using card");
    }
}
