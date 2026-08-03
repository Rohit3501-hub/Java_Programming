package SmartNotificationSystem;

public class Notification {
    private int notificatonId;
    private String recipientName;
    private String message;

    public Notification(int notificatonId, String recipientName, String message) {
        this.notificatonId = notificatonId;
        this.recipientName = recipientName;
        this.message = message;
    }

    public void displayNotificationDetails() {
        System.out.println("Notification ID: " + notificatonId);
        System.out.println("Recipient Name: " + recipientName);
        System.out.println("Message: " + message);
    }
    public void sendNotification(){
        System.out.println("Sending notification to " + recipientName + ": " + message);
    }
}
