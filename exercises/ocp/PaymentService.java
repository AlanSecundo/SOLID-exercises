public class PaymentService {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            // Lógica para processar pagamento com cartão de crédito
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equals("PayPal")) {
            // Lógica para processar pagamento com PayPal
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            throw new UnsupportedOperationException("Payment method not supported");
        }
    }
}
