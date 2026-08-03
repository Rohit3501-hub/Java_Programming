package com.test.polymorhphism.payment;

public class NetBankingPayment extends Payment {
    private String bankName;

    public NetBankingPayment(int transactionId, String customerName, double amount, String bankName) {
        super(customerName, amount);
        this.bankName = bankName;
    }

    @Override
    public void displayTransactionDetails() {
        super.displayTransactionDetails();
        System.out.println("Bank Name: " + bankName);
    }

    @Override
    void pay() {
        System.out.println("Processing Net Banking payment of amount.... ");
        System.out.println("Authentication successful for bank: ");
        System.out.println("Payment of amount " );

    }

}
