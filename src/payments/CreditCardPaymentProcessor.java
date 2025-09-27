package payments;

/**
 * Существующая реализация интерфейса PaymentProcessor.
 */
public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}
