package day1;

public class BOFAApplication {
    public static void main(String[] args) {
        BankAccount prakashAccount = new BankAccount();
        prakashAccount.setAccountName("Prakash Khadka");
        prakashAccount.setAccountBalances(20000);
        prakashAccount.setAccountType("Checking");
        prakashAccount.setAddress("8707 Troy St ");
        prakashAccount.deposit(prakashAccount, 2000);
        prakashAccount.getBANK_NAME();
        prakashAccount.setPhoneNumber(7134259);
        System.out.println(prakashAccount.getAccountName());
        System.out.println(prakashAccount.getAccountBalances());
        System.out.println(prakashAccount.getAccountType());
        System.out.println(prakashAccount.getAddress());
        System.out.println(prakashAccount.getBANK_NAME());
        System.out.println(prakashAccount.getPhoneNumber());
        BankAccount archanaAccount = new BankAccount();
        archanaAccount.setAccountName("Archana Giri");
    }
}
