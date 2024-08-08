
public class CreditCardPaymentProcessor implements PaymentProcessor {

    @override
    public void processPayment(double amount) {
        // Lógica para processar pagamento com cartão de crédito
        System.out.println("Processing credit card payment of $" + amount);
    }
}