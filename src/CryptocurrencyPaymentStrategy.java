
public class CryptocurrencyPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment for " + amount);
    }
}