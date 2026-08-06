package BankingManagementSystem;

public class LoanAccount extends Account {
    private double loanAmount;
    private String loantype;
    private double intrestRate;

    public LoanAccount(int accountNumber, String holderName, double balance, double loanAmount, String loantype, double intrestRate) {
        super(accountNumber, holderName, balance);
        this.loanAmount = loanAmount;
        this.loantype = loantype;
        this.intrestRate = intrestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoantype() {
        return loantype;
    }

    public void setLoantype(String loantype) {
        this.loantype = loantype;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    @Override
    void deposit(double amount) {
        System.out.println("Your loan is approve ....");
    }

    @Override
    void withdraw(double withdraw) {
        System.out.println("Yout loan is Withdraw .........");

    }

    @Override
    void calculateInterest() {
        double totalcalculateInterest = (getBalance() * 5000 * intrestRate * 2) / 100;
        System.out.println("Loan Amount Interest is :" + totalcalculateInterest);
    }
}
