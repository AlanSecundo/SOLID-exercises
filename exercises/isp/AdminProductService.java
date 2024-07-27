public class AdminProductService implements ProductService {
    private ProductRepository repository;

    public AdminProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void removeProduct(int productId) {
        repository.delete(productId);
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