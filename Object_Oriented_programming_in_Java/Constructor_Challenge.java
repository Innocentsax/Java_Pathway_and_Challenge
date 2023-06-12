public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(){
        this("Nobody", "Nobody@gmail.com");
    }
    public Customer(String name, String emailAddress) {
        this(name, 3456, emailAddress);
//        this.name = name;
//        this.emailAddress = emailAddress;
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}



public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Innocent", 3450, "chare@mmm");

        System.out.println("Hi, your name is " + customer.getName() +
                " with credit Limit of " + customer.getCreditLimit() +
                " and it has been forwarded to your email @ " + customer.getEmailAddress());

        Customer customer2 = new Customer();
        System.out.println("Hi, your name is " + customer.getName() +
                " with credit Limit of " + customer.getCreditLimit() +
                " and it has been forwarded to your email @ " + customer.getEmailAddress());

    }
}
