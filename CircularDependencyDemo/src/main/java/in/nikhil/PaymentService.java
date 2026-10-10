package in.nikhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//  FIELD DEPENDENCY INJECTION
    @Autowired
    OrderService orderService;

//    CONSTRUCTOR DEPENDENCY INJECTION
//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("Payment done");
        orderService.getOrderDetails();
    }
}
