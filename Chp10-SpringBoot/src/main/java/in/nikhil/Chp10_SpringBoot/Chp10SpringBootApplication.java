package in.nikhil.Chp10_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Chp10SpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Chp10SpringBootApplication.class, args);

		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);

		paymentGateway.print();
	}

}
