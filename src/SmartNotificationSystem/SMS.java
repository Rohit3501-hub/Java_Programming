package SmartNotificationSystem;

public class SMS extends Notification {
    public SMS(int notificatonId, String recipientName, String message) {
        super(notificatonId, recipientName, message);

    }

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification...\n" +
                "Connecting to SMS Gateway...\n" +
                "Delivering Message...\n" +
                "SMS sent successfully.\n");
    }
}
