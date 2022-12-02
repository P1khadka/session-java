package day1;

public class BankAccount {
    // States
    // account number(String)
    private String accountName;

    public void setAccountName(String accountName) {

        this.accountName = accountName;
    }

    public String getAccountName() {

        return this.accountName;
    }

    //Account holder name(String)
    private String accoutHolderName;
    public String getAccoutHolderName() {
        return accoutHolderName;
    }

    public void setAccoutHolderName(String accoutHolderName) {
        this.accoutHolderName = accoutHolderName;
    }
    // Account balances(double)
    private double accountBalances;
    public void setAccountBalances(double accountBalances){
        this.accountBalances=accountBalances;
    }

    public double getAccountBalances() {
        return accountBalances;
    }

    // Account type(String)
    private String accountType;
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public String getAccountType(){
        return this.accountType;
    }
    // phone number(long)
    private long phoneNumber;
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    // Statements(list)
    //Address(String)
    private String address;
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }



    //Linked card(list)
    // bank name(String)
    private final String BANK_NAME = "BOFA";

    public String getBANK_NAME(){
        return this.BANK_NAME;

    }

    // Social card number(String)
    private String socialCardNumber;

    public void setSocialCardNumber(String socialCardNumber) {
        this.socialCardNumber = socialCardNumber;
    }




    // Opening branch(String)
    private String openingBranch;
    public String getOpeningBranch() {
        return openingBranch;
    }

    public void setOpeningBranch(String openingBranch) {
        this.openingBranch = openingBranch;
    }
    //Behavior

    //deposit
    public double deposit(BankAccount toAccountNumber, double amountToBeDeposited) {
        return 0.0;
    }

    //withdraw
    public double withDraw(BankAccount fromAccount, double amountToBeWithDrawn) {
        return 0.00;
    }

    // transfer balance
    public boolean transferBalances(BankAccount fromAccount, BankAccount toAccount, double amountToBeTransfer) {
        return true;
    }

    //download statements
    public String downloadStatements(BankAccount account, String fromDate, String toDate) {
        return "";
    }

    //link credit card
    public void linkCreditCard(BankAccount account, String creditCardNumber) {
        return;
    }

    //link debit card
    //check balance
    public double checkBalances(BankAccount account) {
        return account.accountBalances;
    }

}
