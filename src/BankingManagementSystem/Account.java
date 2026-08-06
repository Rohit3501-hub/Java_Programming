package BankingManagementSystem;

public abstract class Account {
    private int accountNumber;
    private String HolderName;
    private double Balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        HolderName = holderName;
        Balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    void displayAccountDetails()
    {
        System.out.println("******************************");
        System.out.println("Customer Name\n" +
                "Account Number\n" +
                "Current Balance\n" +
                "Account Type\n");
    }

    abstract void deposit(double ammount);

    abstract void withdraw(double ammount);

    abstract void calculateInterest();
}
