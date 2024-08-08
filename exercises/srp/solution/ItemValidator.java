
public class ItemValidator {

    public boolean validateItems(List<String> items) {
        // Lógica que valida se os itens do pedido são válidos (por exemplo, se estão disponíveis no estoque)
        for (String item : items) {
            if (!isItemAvailable(item)) {
                return false;
            }
        }
        return true;
    }

    private boolean isItemAvailable(String item) {
        // Lógica para verificar se o item está disponível no estoque
        return true;
    }

}
