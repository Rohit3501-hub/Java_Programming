package BankingManagementSystem;

public class main {
    public static void main(String[] args) {

        Customer customer = new Customer(101,"Sujay",789456123,"sujay211@infogmail.com","Hyderabaad Ammerpet");
        Customer customer1 = new Customer (102, "Rohit Parmar", 930274,"parmarrohit3501@gmail.com","Shujalpur(Indore) M.P");
        customer1.displayCustomerDetails();


        SavingAccount savingaccount = new SavingAccount(789456,"Rohit Parmar",10000,5.0);
        savingaccount.calculateInterest();

        LoanAccount loanaccount = new LoanAccount(123456,"Ajay",10000,100000,"carLoan",5.0);
        loanaccount.calculateInterest();
    }
}
