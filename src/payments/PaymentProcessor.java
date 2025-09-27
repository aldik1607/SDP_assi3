package payments;

/**
 * Целевой интерфейс, с которым работает система.
 */
public interface PaymentProcessor {
    void processPayment(double amount);
}
