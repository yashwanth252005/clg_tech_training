package JavaTraining.module4;

//Create an interface Payment with method pay(). Implement it in CreditCardPayment
//and UPIPayment classes.

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card ending in " +
                cardNumber.substring(cardNumber.length() - 4));
    }
}

class UPIPayment implements Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Payment card = new CreditCardPayment("1234-5678-9012-3456");
        Payment upi = new UPIPayment("user@okaxis");

        // Processing payments
        card.pay(1500.50);
        upi.pay(450.00);
    }
}
