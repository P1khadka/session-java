package day1;

public class BankAccount {
    // States
    // account number(String)
    String accountName;
    //Account holder name(String)
    String accoutHolderName;
    // Account balances(double)
    double accountBalances;
    // Account type(String)
    String accountType;
    // phone number(long)
    long phoneNumber;
    // Statements(list)
    //Address(String)
    String address;
    //Linked card(list)
    // bank name(String)
    final String BANK_NAME="BOFA";
    // Social card number(String)
    String socialCardNumber;
    // Opening branch(String)
    String openingBranch;


    //Behavior

    //deposit
    public double deposit(BankAccount toAccountNumber, double amountToBeDeposited){
return 0.0;
    }
    //withdraw
    public double withDraw(BankAccount fromAccount, double amountToBeWithDrawn){
        return 0.00;
    }
    // transfer balance
    public boolean transferBalances(BankAccount fromAccount, BankAccount toAccount, double amountToBeTransfer){
        return true;
    }
    //download statements
    public String downloadStatements(BankAccount account, String fromDate, String toDate){
        return "";
    }
    //link credit card
    public void linkCreditCard(BankAccount account, String creditCardNumber){
        return;
    }
    //link debit card
    //check balance
    public double checkBalances(BankAccount account){
        return account.accountBalances;
    }

}
