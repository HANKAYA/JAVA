package code.PRACTICE_JAVA;

public class P116_CapitalOne {
    public static void main(String[] args) {
        P115_BankAccountCapitalOne account1 = new P115_BankAccountCapitalOne("HAN","KAYA");

    System.out.println("account1.getAccountHolder() = " + account1.getAccountHolder());
        System.out.println(account1.FirstName);
    //System.out.println(account1.accountHolder); we use getter method

        System.out.println("account1.getBalance() = " + account1.getBalance());
        account1.setBalance(200);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.deposit(10);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.deposit(0.1);
        account1.deposit(500);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.withdraw(300);
        System.out.println("account1.getBalance() = " + account1.getBalance());

        account1.availableBalance();

        System.out.println(account1);
        account1.setAccountNumber(342354245);
        System.out.println("account1.getAccountNumber() = " + account1.getAccountNumber());

    P115_BankAccountCapitalOne account2=new P115_BankAccountCapitalOne("G","B");
        account2.availableBalance();
        System.out.println(account2);

        account2.deposit(300);
        System.out.println(account2);
}
}
