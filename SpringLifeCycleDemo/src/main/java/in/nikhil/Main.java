package in.nikhil;

import in.nikhil.classes.AppConfig;
import in.nikhil.classes.CartService;
import in.nikhil.classes.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//      IoC CONTAINER ALSO MANAGES THE BEAN OF AppConfig class
//        AppConfig config = context.getBean(AppConfig.class);
//        config.demo();

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        context.close();
    }
}
