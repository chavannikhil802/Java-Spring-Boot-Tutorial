package in.nikhil;

import in.nikhil.notification.EmailService;
import in.nikhil.notification.NotificationService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public OrderService() {}

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
