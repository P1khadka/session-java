package day1;

public class BOFAApplication {
    public static void main(String[] args) {
BankAccount prakashAccount= new BankAccount();
prakashAccount.setAccountName("Prakash Khadka");
prakashAccount.setAccountBalances(20000);
prakashAccount.setAccountType("Checking");
prakashAccount.setAddress("8707 Troy St ");
prakashAccount.deposit(prakashAccount, 2000);
prakashAccount.getBANK_NAME();
        System.out.println(prakashAccount);
BankAccount archanaAccount= new BankAccount();
archanaAccount.setAccountName("Archana Giri");
    }
}
