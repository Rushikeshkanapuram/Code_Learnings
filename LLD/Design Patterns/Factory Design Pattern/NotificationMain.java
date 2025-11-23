
public class NotificationMain {
    public static void main(String[] args) {
        // Notification notification = new SMSNotification();
        // notification.notifyUser();

        Notification n1=NotificationFactory.createNotification("Email");
        n1.notifyUser();

        Notification n2=NotificationFactory.createNotification("SMS");
        n2.notifyUser();
    }
}
