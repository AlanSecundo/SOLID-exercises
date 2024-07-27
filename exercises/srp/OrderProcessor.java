
public class OrderProcessor {
    private List<String> items;
    private double total;
    private String paymentMethod;
    private String customerEmail;

    public OrderProcessor(List<String> items, String paymentMethod, String customerEmail) {
        this.items = items;
        this.paymentMethod = paymentMethod;
        this.customerEmail = customerEmail;
        this.total = 0.0;
    }

    public void processOrder() {
        if (validateItems()) {
            calculateTotal();
            if (processPayment()) {
                sendReceipt();
            }
        }
    }

    private boolean validateItems() {
        // Lógica que valida se os itens do pedido são válidos (por exemplo, se estão disponíveis no estoque)
        for (String item : items) {
            if (!isItemAvailable(item)) {
                return false;
            }
        }
        return true;
    }

    private void calculateTotal() {
        for (String item : items) {
            total += getItemPrice(item);
        }
    }

    private boolean processPayment() {
        // Lógica para processar pagamento com o método especificado
        // Pode incluir interação com APIs de pagamento, etc.
        System.out.println("Processing payment with " + paymentMethod);
        return true;
    }

    private void sendReceipt() {
        // Lógica para enviar um recibo por e-mail ao cliente
        System.out.println("Sending receipt to " + customerEmail);
    }

    private boolean isItemAvailable(String item) {
        // Lógica para verificar se o item está disponível no estoque
        return true;
    }

    private double getItemPrice(String item) {
        // Lógica para obter o preço do item
        return 10.0; 
    }
}
