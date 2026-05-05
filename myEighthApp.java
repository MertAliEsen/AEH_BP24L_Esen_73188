public class myEighthApp {
    public static void main(String[] args) {
        // start with 1000 PLN and other details
        Account acc = new Account("PL12345", 1000.0, "Mert", "mert@mail.com", "123456789");
        
        acc.withdraw(900.0);
        acc.deposit(250.0);
        acc.withdraw(50.0);
        acc.withdraw(500.0);
    }
}