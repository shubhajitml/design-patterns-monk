public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }
        Notification notification = null;
        switch (channel){
            case "SMS":
                notification = new SMSNotification(); break;
            case "EMAIL":
                notification = new EmailNotification(); break;
            case "PUSH":
                notification = new PushNotification(); break;
            default:
                throw new IllegalArgumentException("Unknow channel type: "+channel);
        }
        return notification;
    }
}
