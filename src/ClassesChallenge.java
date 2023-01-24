
public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount casey = new BankAccount(
                100,
                "(817)-907-7652",
                "Casey Ramirez",
                "caseyjramirez5@gmail.com"
        );

        System.out.println(casey.getAccountNumber());
        System.out.println(casey.getAccountBalance());
        casey.withdraw(200);
        System.out.println(casey.getAccountBalance());
        casey.deposit(200);
        System.out.println(casey.getAccountBalance());
        casey.withdraw(200);
        System.out.println(casey.getAccountBalance());

    }
}
