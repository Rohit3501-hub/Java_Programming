package com.test.polymorhphism.payment;

public class UpiPayment extends Payment {
    //private int transactionId;
    private String upiId;

    public UpiPayment(int transactionId,String customerName, double amount, String upiId) {
        super(customerName, amount);
        this.upiId = upiId;
    }

    @Override
    public void displayTransactionDetails() {
        super.displayTransactionDetails();
        System.out.println("UPI ID: " + upiId);
    }
    @Override
    void pay() {
        System.out.println("Processing UPI payment " +  " made by ");
        System.out.println("Sending Request to  UPI server .....: ");
        System.out.println("Authentication successful for UPI ID: ");
        System.out.println("Payment of amount ");

    }
}
