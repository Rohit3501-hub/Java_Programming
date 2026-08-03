package com.test.polymorhphism.payment;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();
        System.out.println("Enter amount:");
        double amount = sc.nextDouble();
        System.out.println("Select payment method (1: Credit Card, 2: Net Banking, 3: UPI):");
        int paymentMethod = sc.nextInt();

        System.out.println("Enter the choice of payment method (1: Credit Card, 2: Net Banking, 3: UPI):");
        int choice = sc.nextInt();
        Payment payment;

        switch (choice) {
            case 1:
                System.out.println("Enter credit card number:");
                String cardNumber = sc.next();
                System.out.println("Transaction id : 1010101010");

                payment = new CreditCardPayment (1010101010, customerName, amount, cardNumber);
                break;
            case 2:
                System.out.println("Enter bank name:");
                String bankName = sc.next();
                System.out.println("Transaction id : 1010101010");
                payment = new NetBankingPayment(1010101010, customerName, amount, bankName);
                break;
            case 3:
                System.out.println("Enter UPI ID:");
                String upiId = sc.next();
                System.out.println("Transaction id : 1010101010");
                payment = new UpiPayment(1010101010, customerName, amount, upiId);
                break;
            default:
                System.out.println("Invalid payment method selected.");
                return;
        }
    }
}