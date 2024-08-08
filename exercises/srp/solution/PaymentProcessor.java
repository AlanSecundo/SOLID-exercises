
public class PaymentProcessor {

    public boolean processPayment(String paymentMethod) {
        try {
            // Lógica para processar pagamento com o método especificado
            // Pode incluir interação com APIs de pagamento, etc.
            System.out.println("Processing payment with " + paymentMethod);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}
