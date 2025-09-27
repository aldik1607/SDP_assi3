package payments;

/**
 * Адаптер: переводит интерфейс PayPalService в PaymentProcessor.
 */
public class PayPalAdapter implements PaymentProcessor {
    private final PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void processPayment(double amount) {
        payPalService.makePayment(amount); // перевод вызова
    }
}
