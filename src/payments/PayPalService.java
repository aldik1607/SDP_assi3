package payments;

/**
 * Сторонний сервис с несовместимым интерфейсом.
 * Его мы НЕ меняем.
 */
public class PayPalService {
    public void makePayment(double money) {
        System.out.println("Processing PayPal payment: $" + money);
    }
}
