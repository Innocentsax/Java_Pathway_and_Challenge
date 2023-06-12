public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //Constructor
    public BankAccount(){
        this("2120100314", 500, "Innocent Charles", "Innocent.udo@decagon.dev", "08163093928");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameter called");
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        email = email;
        phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.5, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (accountBalance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account");
        }
        accountBalance -= withdrawalAmount;
        System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = " + accountBalance);

    }
    public String setCustomerName(){
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

     public void userAccount(){
        System.out.println("Hi " + customerName + ", with account number. " +
                accountNumber + " Your account balance is " + accountBalance +
                " and it has been forwarded to your email @ " + email + " and your phone number @ " + phoneNumber);
    }
}


public class Main {
    public static void main(String[] args) {
        //BankAccount udoAccount = new BankAccount("2120100314", 900,
         //       "Innocent charles", "innocentcharlesudo@gmail.com", "08143093928");

        BankAccount udoAccount = new BankAccount();
        System.out.println(udoAccount.getAccountNumber());
        System.out.println(udoAccount.getAccountBalance());

        BankAccount charlesAccount = new BankAccount("Stanly", "stanly@decagon.dev", "09098765432");
        System.out.println("AccountNo: " + charlesAccount.getAccountNumber() + "; name " + charlesAccount.getCustomerName());

    }
}
