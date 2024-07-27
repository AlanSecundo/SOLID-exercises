public class CustomerProductService implements ProductService {
    private ProductRepository repository;

    public CustomerProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addProduct(Product product) {
        // Clientes não podem adicionar produtos, método vazio ou lança uma exceção
        throw new UnsupportedOperationException("Customers cannot add products.");
    }

    @Override
    public void removeProduct(int productId) {
        // Clientes não podem remover produtos, método vazio ou lança uma exceção
        throw new UnsupportedOperationException("Customers cannot remove products.");
    }

    @Override
    public Product getProduct(int productId) {
        return repository.findById(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}