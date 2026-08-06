package BankingManagementSystem;

public class Bank implements BankingServices {



    @Override
    public void transfer(Account from, Account to, double amount) {

        System.out.println("Verify sufficient balance.\n" +
                "Deduct money from the sender.\n" +
                "Credit the receiver.\n" +
                "Display success message.\n" +
                "Loan Approval\n");
    }


    @Override
    public void approveLoan(Customer customer, double amount) {
        if (amount < 1000000) {
            System.out.println("Customer is eligible ");
        } else {
            System.out.println(" Laon Rejected ");

        }
    }

    public void generateStatement(Account account) {
        account.displayAccountDetails();
    }


   /* public void deposit(double amount) {
        int balance = 5000;
        int balance = balance + amount;
        System.out.println("Deposit" + amount);
        System.out.println("Current Balance :" + balance);
    }


    public void deposit(double amount,String remarks) {
        double balance = getBalance() + amount;
        System.out.println("Deposit :" + amount);
        String remakrs = "null";
        System.out.println("Remarks : " + remakrs);
        System.out.println("Balance :" + balance);
    }

    public void deposit(int amount) {
        System.out.println("Amount :" + amount);
        double  balance = getBalance() + amount;
        System.out.println("Deposited :" + amount);
        System.out.println("Balance :" + balance);

    }*/


}