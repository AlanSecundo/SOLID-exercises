public class PaymentService {
    private Map<String, PaymentProcessor> paymentProcessors = new HashMap<>();

    public PaymentService() {
        paymentProcessors.put("CREDIT_CARD", new CreditCardPaymentProcessor());
        paymentProcessors.put("PAYPAL", new PayPalPaymentProcessor());
    }


    public void processPayment(String paymentType, double amount) {
        PaymentProcessor paymentProcessor = paymentProcessors.get(paymentType.toUpperCase());

        if (paymentProcessor == null) {
            throw new UnsupportedOperationException("Payment method not supported");
        }

        paymentProcessor.processPayment(amount);
    }

    public void addPaymentProcessor(String paymentType, PaymentProcessor paymentProcessor) {
        paymentProcessors.put(paymentType.toUpperCase(), paymentProcessor);
    }
}


// EXEMPLO

// paymentService.registerProcessor("Bitcoin", new BitcoinPaymentProcessor());