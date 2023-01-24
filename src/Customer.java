public class Customer {
    private String name, email;
    private int creditLimit;

    public Customer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer() {
        this("Default Name", "myEmail@email.come", 100);
    }

    public Customer(String name, String email) {
        this(name, email, 100);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
