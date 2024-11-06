public class NotificationService {
    public static void main(String[] args) {
//        If object creation code is spread in the whole application, and if you need to change the process of
//        object creation then you need to go in each and every place to make necessary changes. To avoid this,
//        Factory design pattern was introduced with a goal to centralise the object creation process.
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
        notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
        notification = notificationFactory.createNotification("PUSH");
        notification.notifyUser();
        notification = notificationFactory.createNotification("MOBILE");
        notification.notifyUser();
    }
}
