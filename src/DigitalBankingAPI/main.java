package DigitalBankingAPI;

public class main {
    public static void main(String[] args) {
      DigitalBank bank = new DigitalBank(101,"Rohit Parmar",45123698,5000);
      bank.TransferFunds();
      bank.approveLoan();
    }
}
