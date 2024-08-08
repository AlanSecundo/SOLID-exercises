
public class OrderProcessor {
    private List<String> items;
    private double total;
    private String paymentMethod;
    private String customerEmail;

    private ItemValidator itemValidator;
    private OrderCalculator orderCalculator;
    private PaymentProcessor paymentProcessor;
    private ReceiptSender receiptSender;

    public OrderProcessor(List<String> items, String paymentMethod, String customerEmail, 
    ItemValidator itemValidator, OrderCalculator orderCalculator, 
    PaymentProcessor paymentProcessor, ReceiptSender receiptSender) {
        
        this.items = items;
        this.paymentMethod = paymentMethod;
        this.customerEmail = customerEmail;
        this.total = 0.0;

        this.itemValidator = itemValidator;
        this.orderCalculator = orderCalculator;
        this.paymentProcessor = paymentProcessor;
        this.receiptSender = receiptSender;
    }

    public void execute() {
        if (itemValidator.validateItems(items)) {
            processOrder();
        }
    }

    private void processOrder() {
        total = orderCalculator.calculateTotal(items);
        boolean paymentProcessed = paymentProcessor.processPayment(paymentMethod);
        if (paymentProcessed) {
            sendReceipt();
        }
    }
}
