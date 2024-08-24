/**
 * EncapsulationExample
 * 
 * This program demonstrates encapsulation in Java.
 */
class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Account Balance: " + account.getBalance());
    }
}
