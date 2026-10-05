package in.nikhil;

import in.nikhil.payment.CardPaymentService;
import in.nikhil.payment.interfaces.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.nikhil")
public class AppConfig {

    @Bean
    public UserService createUser() {
        return new UserService(34, "Nikhil");
    }

    @Bean
    public CardPaymentService cardPayment() {
        return new CardPaymentService();
    }

    @Bean
    public OrderService createOrder(PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}
