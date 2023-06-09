public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


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

    public int getPhoneNumber() {
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

    public void setPhoneNumber(int phoneNumber) {
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

        BankAccount udoAccount = new BankAccount();

        udoAccount.setAccountBalance(25000.00);
        udoAccount.setAccountNumber("2120100312");
        udoAccount.setCustomerName("UDO INNOCENT CHARLES");
        udoAccount.setPhoneNumber("08163093928");
        udoAccount.setEmail("innocentcharlesudo@gmail.com");

        udoAccount.userAccount();


        udoAccount.depositFunds(500);
        udoAccount.withdrawFunds(250);

        udoAccount.depositFunds(100);
        udoAccount.withdrawFunds(45);
        udoAccount.withdrawFunds(250);
}

