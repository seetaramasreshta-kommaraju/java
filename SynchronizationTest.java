class BankAccount {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " Withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " Insufficient funds for withdrawal of " + amount);
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    int amount;

    Customer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount); 
    }
}

public class SynchronizationTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer t1 = new Customer(account, 7000);
        Customer t2 = new Customer(account, 5000);

        t1.setName("Customer1");
        t2.setName("Customer2");

        t1.start();
        t2.start();
    }
}
