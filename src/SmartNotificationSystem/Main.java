package SmartNotificationSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Notification notification1 = new SMS(101, "Rohit", "Your Otp is 1234.");
        Notification notification2 = new Email(102, "Ajay", "Your order has been shipped.");
        Notification notification3 = new PushNotification(103, "Ajay", "Your food order is arriving in 10");
*/

        SMS sms;
        Email email;
        PushNotification pushNotification;

        ArrayList<Notification> notifications = new ArrayList<>();

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Message: ");
        String message = scanner.nextLine();

        System.out.println("Type : ");
        System.out.println("1.SMS");
        System.out.println("2.Email");
        System.out.println("3.PushNotification");

        System.out.println("Enter type...");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                sms = new SMS(10101011, name, message);
                notifications.add(sms);
                break;

            case 2:
                email = new Email(2222222, name, message);
                notifications.add(email);
                break;

            case 3:
                pushNotification = new PushNotification(333333, name, message);
                notifications.add(pushNotification);
                break;

            default:
                System.out.println("Enter valid choice.......");
        }


        Iterator<Notification> notificationIterator = notifications.iterator();
        while (notificationIterator.hasNext()) {
            Notification n = notificationIterator.next();
            n.displayNotificationDetails();
            System.out.println();
            n.sendNotification();
        }


    }
}
