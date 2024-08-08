public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.registerProcessor("Bitcoin", new BitcoinPaymentProcessor());

        paymentService.processPayment("CreditCard", 100.0);
        paymentService.processPayment("PayPal", 200.0);
        paymentService.processPayment("Bitcoin", 300.0);
    }
}