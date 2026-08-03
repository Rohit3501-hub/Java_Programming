package com.test.polymorhphism.payment;

public class Payment {
    private int  transactionId;
    private String CustomerName;
    private double amount ;

    public Payment(String customerName, double amount) {
        this.transactionId = transactionId;
       this.CustomerName = customerName;
        this.amount = amount;
    }
    public void displayTransactionDetails(){
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Amount: " + amount);
    }
    void pay(){
        System.out.println("Payment of amount");



    }
}
