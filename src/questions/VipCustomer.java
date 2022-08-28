package questions;

public class VipCustomer {
    private String Name;
    private double CreditLimit;
    private String EmailAddress;

    public VipCustomer() {
        this("Bipul",10000,"bipulwagle@gmail.com");
        System.out.println("First Constructor called");

    }

    public VipCustomer(String Name, String EmailAddress) {
        this(Name, 100000, EmailAddress);
        System.out.println("Second Constructor Called");
    }

    public VipCustomer(String Name, double CreditLimit, String EmailAddress) {
        System.out.println("Third Constructor Called");
        this.Name = Name;
        System.out.println("Your name is " + Name);
        this.CreditLimit = CreditLimit;
        System.out.println("Your credit Limit is Rs " + CreditLimit);
        this.EmailAddress = EmailAddress;
        System.out.println("Your email address is " + EmailAddress);
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
