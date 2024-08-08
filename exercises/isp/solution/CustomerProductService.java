public class CustomerProductService implements ProductReader {
    private ProductRepository repository;

    public CustomerProductService(ProductRepository repository) {
        this.repository = repository;
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