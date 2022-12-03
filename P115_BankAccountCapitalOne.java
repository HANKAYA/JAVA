package code.PRACTICE_JAVA;

public class P115_BankAccountCapitalOne {

    // Create a custom class called BankAccountCapitalOne for CapitalOne bank accounts:
    // NAME - ACCOUNT INFO - BALANCE

    //			public variables:  bankName, firstName, lastName
    //	 		private variables: accountHolder, accountNumber, balance
    //	 		encapsulate all the private data
    //	 		create a constructor that can initialize firstName and fullName
    //
    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				available balance
    //	 				toString: returns the full name and balance

    //    //			public variables:  bankName, firstName, lastName

    public static String BankName= "Capital One"; // Static Public
    public String FirstName; // Instance Public
    public String LastName ; // Instance Public
    private String accountHolder;
    private long accountNumber;
    private double balance ;

    // Create a constructor that can initialize First name and FullName
    // ==> constructor  : access modifier + class name
    public P115_BankAccountCapitalOne(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName  = LastName ;
        // First + Last = Account Holder
        this.accountHolder = FirstName +" "+ LastName;
    }
    // ==> ENCAPSULATE all the private data
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    // -  A C T I O N  -
    //	 				depositing
    //	 				withdrawing
    //	 				available balance
    //	 				toString: returns the full name and balance

    // If I deposit money to my account my balance should be increased

    public void deposit(double money){  // --> Balance + Money
        setBalance(balance - money);
    }
    public void withdraw(double money){
        setBalance(balance - money);
    }
    public void availableBalance(){
        System.out.println("Available Balance is: "+ getBalance());
    }
    // toString: returns the full name and balance
    // to string will help us to define what object means for the class
    public String toString(){
        return "Full name is " + getAccountHolder() + "--- Balance is: " + getBalance();
    }

}
