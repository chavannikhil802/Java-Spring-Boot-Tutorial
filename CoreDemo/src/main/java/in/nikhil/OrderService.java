package in.nikhil;

import in.nikhil.notification.EmailService;
import in.nikhil.notification.NotificationService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
