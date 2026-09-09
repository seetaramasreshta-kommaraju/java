abstract class Payment {

    protected double account_balance;
    protected double amount;

    Payment(double account_balance, double amount) {
        this.account_balance = account_balance;
        this.amount = amount;
    }

    double updateBalance() {
        account_balance += 500;
        return account_balance;
    }

    void displayAmount() {
        System.out.println("Payment Amount: Rs." + amount);
    }

    void generateReceipt() {
        System.out.println("Payment receipt generated successfully.");
    }

    abstract void makePayment();
}


class UPIPayment extends Payment {

    private String upiID;

    UPIPayment(double account_balance, double amount, String upiID) {
        super(account_balance, amount);
        this.upiID = upiID;
    }

    @Override
    void makePayment() {
        if (account_balance >= amount) {
            account_balance -= amount;
            System.out.println("UPI payment completed using: " + upiID);
            System.out.println("Remaining balance: Rs." + account_balance);
        } else {
            System.out.println("Insufficient balance for UPI payment.");
        }
    }
}


class CardPayment extends Payment {

    private String card_number;

    CardPayment(double account_balance, double amount, String card_number) {
        super(account_balance, amount);
        this.card_number = card_number;
    }

    @Override
    void makePayment() {
        if (account_balance >= amount) {
            account_balance -= amount;
            System.out.println("Card payment completed using card: " + card_number);
            System.out.println("Remaining balance: Rs." + account_balance);
        } else {
            System.out.println("Insufficient balance for card payment.");
        }
    }
}


class Netbanking extends Payment {

    private String bankname;

    Netbanking(double account_balance, double amount, String bankname) {
        super(account_balance, amount);
        this.bankname = bankname;
    }

    @Override
    void makePayment() {
        if (account_balance >= amount) {
            account_balance -= amount;
            System.out.println("Netbanking payment completed through: " + bankname);
            System.out.println("Remaining balance: Rs." + account_balance);
        } else {
            System.out.println("Insufficient balance for netbanking payment.");
        }
    }
}


class PaymentDemo {

    public static void main(String[] args) {

        Payment payment;

        System.out.println("------------- UPI Payment ------------");
        payment = new UPIPayment(5000, 1500, "sreshta@upi");
        payment.displayAmount();
        payment.makePayment();
        payment.generateReceipt();
        System.out.println("Updated balance: Rs." + payment.updateBalance());

        System.out.println("\n------------- Card Payment ------------");
        payment = new CardPayment(5000, 2000, "1234-5678-9012-3456");
        payment.displayAmount();
        payment.makePayment();
        payment.generateReceipt();
        System.out.println("Updated balance: Rs." + payment.updateBalance());

        System.out.println("\n------------- Netbanking ------------");
        payment = new Netbanking(5000, 1000, "SBI");
        payment.displayAmount();
        payment.makePayment();
        payment.generateReceipt();
        System.out.println("Updated balance: Rs." + payment.updateBalance());

    }
}