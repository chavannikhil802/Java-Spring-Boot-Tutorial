package in.nikhil;

import in.nikhil.notification.EmailService;
import in.nikhil.notification.NotificationService;
import in.nikhil.notification.PopupService;
import in.nikhil.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        NotificationService notification = new PopupService();

        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
