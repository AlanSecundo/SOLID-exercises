public class Order {
    public double calculateTotal(List<String> items) {
        double total = 0.0;
        for (String item : items) {
            total += getItemPrice(item);
        }

        return total;
    }

    
    private double getItemPrice(String item) {
        // Lógica para obter o preço do item
        return 10.0; 
    }
}