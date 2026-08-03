package com.test.polymorhphism.payment;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(int transactionId, String customerName, double amount, String cardNumber) {
        super(customerName, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void displayTransactionDetails() {
        super.displayTransactionDetails();
        System.out.println("Credit Card Number: " + cardNumber);
    }

    @Override
    void pay() {
        System.out.println("verifying card details..." );
    }
}
