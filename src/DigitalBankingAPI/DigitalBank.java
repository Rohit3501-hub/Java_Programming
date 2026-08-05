package DigitalBankingAPI;

public class DigitalBank {
    private int customerId;
    private String customerName;
    private double accountNumber;
    private double accountBalance;

    public DigitalBank(int customerId, String customerName, double accountNumber, double accountBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void TransferFunds() {
        double ammount = 5000;
        if (accountBalance >= 5000) {
            accountBalance = accountBalance - ammount;
            System.out.println("Funds Transfer is Successfully");
            System.out.println("Transfer Ammount " + ammount);
            System.out.println("Remmaing Ammount " + accountBalance);
        } else {
            System.out.println("Invalid Ammount............!");
        }
    }

    public void approveLoan() {
        System.out.println("Approve Loan is Successfully");
        System.out.println("Loan Ammount is : 5000");

    }

    public void purchaseInsurance() {
        System.out.println("Insurance Purchased Successfully.");
        System.out.println("Policy : Health Insurance");
    }

    public void displayCustomerDetails() {
        System.out.println("*************************");
        System.out.println("Customer id:" + customerId
                + "customer Name" + customerName
                + "account Number :" + accountNumber
                + "account  Balance: " + accountBalance
        );


    }
}
