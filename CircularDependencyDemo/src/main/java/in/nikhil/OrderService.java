package in.nikhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    FIELD DEPENDENCY INJECTION
    @Autowired
    private PaymentService paymentService;

//    CONSTRUCTOR DEPENDENCY INJECTION
//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order placed");
    }

    public void getOrderDetails() {
        System.out.println("Order details");
    }
}
