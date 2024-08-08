
public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        // Lógica para processar pagamento com PayPal
        System.out.println("Processing PayPal payment of $" + amount);
    }
}