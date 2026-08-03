package SmartNotificationSystem;

public class PushNotification extends Notification {

    public PushNotification(int notificatonId, String recipientName, String message) {
        super(notificatonId, recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification...\n" +
                "Connecting to Notification Server...\n" +
                "Delivering Push Notification...\n" +
                "Push Notification sent successfully.\n");
    }
}
