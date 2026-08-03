package SmartNotificationSystem;

public class Email extends Notification {
    public Email(int notificatonId, String recipientName, String message) {
        super(notificatonId, recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification...");
        System.out.println("Connecting to Mail Server...");
        System.out.println("Sending Email...");
        System.out.println("Email sent successfully.");
    }
}