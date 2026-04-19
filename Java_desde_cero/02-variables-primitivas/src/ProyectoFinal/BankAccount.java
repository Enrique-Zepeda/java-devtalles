package ProyectoFinal;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposito exitoso de: " + amount);
        } else {
            System.out.println("El monto ingresado no es correcto");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Extraccion exitosa!!!");
        } else {
            System.out.println("Fondos insuficientes o monto invalido");
        }
    }

    public void displayBalance() {
        System.out.println("Tu saldo es:" + balance);
    }

}
