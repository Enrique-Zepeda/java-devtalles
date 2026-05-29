package personalizada.unchecked;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdrwa(double amount){
        if (amount > balance) {
            throw new NegativeBalanceException("FOndos insuficientes...");
        }
        balance -= amount;
        System.out.println("Extraccion exitosa");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = null;
        try {
            account = new BankAccount(500);
//        account.withdrwa(300);
        account.withdrwa(600);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account.getBalance());
    }
}
