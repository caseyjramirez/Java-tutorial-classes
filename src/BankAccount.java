public class BankAccount {
    private static int counter;
    private int accountNumber, accountBalance;
    private String customerName, email, phone;

//    constructor
    public BankAccount(int accountBalance, String phone, String customerName, String email) {
        this.accountNumber = counter;
        this.accountBalance = accountBalance;
        this.phone = phone;
        this.customerName = customerName;
        this.email = email;

        counter++;

//        this()
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getPhone() {
        return phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(int deposit) {
        this.accountBalance += deposit;
    }

    public void withdraw(int withdraw) {
        if (withdraw <= this.accountBalance) {
            this.accountBalance -= withdraw;
//            return true;
        } else {
            System.out.println("Insignificant funds!");
//            return false;
        }
    }
}
