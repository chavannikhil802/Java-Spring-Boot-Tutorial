package in.nikhil;

public class OrderService {

    EmailService notification = new EmailService();

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
