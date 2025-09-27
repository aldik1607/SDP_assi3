import payments.PayPalAdapter;
import payments.PayPalService;
import payments.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter(new PayPalService());
        paypal.processPayment(150.0);
    }
}
