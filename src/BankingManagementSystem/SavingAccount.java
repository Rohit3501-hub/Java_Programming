package BankingManagementSystem;

public class SavingAccount extends Account {
    private double interest = 5.0;

    public SavingAccount(int accountNumber, String holderName, double balance, double interest) {
        super(accountNumber, holderName, balance);
        this.interest = interest;
    }

    @Override
    void deposit(double amount) {
        if(amount<=0)
        {
            throw new InvalidAmountException("Invalid Amount.....");
        }else{
            double totalBalance=getBalance()+amount;
            System.out.println("Deposit Successful....."+amount);
        }
    }

    @Override
    void withdraw(double ammount) {
        if(ammount<=0)
        {
            throw new InvalidAmountException("Invalid Amount....");
        }
        double totalBalance=getBalance()-ammount;
        if(totalBalance<1000)
        {
            throw new InsufficientBalanceException("Balance must be greater than 1000");
        }else {
            setBalance(totalBalance);
            System.out.println("Account withdraw done");

        }


    }

    @Override
    void calculateInterest() {
        double totalInterset = (getBalance() * 5000 * interest * 2) / 100;
        System.out.println("*******************");
        System.out.println(" saving account Interest : " + totalInterset);

    }
}
