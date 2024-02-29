package homeworks.FPP.Assignment3.Problem1;

public class Customer {

    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum, Address billingAddress,
            Address shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;

        setBillingAddress(billingAddress);
        setShippingAddress(shippingAddress);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

    public static void main(String[] args) {
        Address address1 = new Address("1000 N 4th St", "Fairfield", "Iowa", "52557");
        Address address2 = new Address("1000 S Columbus Dr", "Chicago", "Illinois", "60605");
        Address address3 = new Address("20 N Wacker Dr", "Chicago", "Illinois", "60606");

        Customer c1 = new Customer("John", "Doe", "123-45-6789", address1, address1);
        Customer c2 = new Customer("Abraham", "Aremu", "987-65-4321", address2, address2);
        Customer c3 = new Customer("Jane", "Doe", "123-45-6789", address3, address3);

        Customer[] customers = { c1, c2, c3 };

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity() == "Chicago") {
                System.out.println(customer.toString());
            }
        }
    }
}
