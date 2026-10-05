package in.nikhil;

import in.nikhil.payment.CardPaymentService;
import in.nikhil.payment.UpiPaymentService;
import in.nikhil.payment.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.nikhil")
public class AppConfig {

    @Bean
    public UserService createUser() {
        return new UserService(34, "Nikhil");
    }

    @Bean
    @Qualifier
    public CardPaymentService cardPayment() {
        return new CardPaymentService();
    }

    @Bean
    //@Primary
    @Qualifier
    public UpiPaymentService upiPayment() {
        return new UpiPaymentService();
    }

    @Bean
    public OrderService createOrder(@Qualifier("upiPayment") PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}
