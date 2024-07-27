
public interface ProductService {
    void addProduct(Product product);
    void removeProduct(Product product);
    Product getProductById(int productId);
    List<Product> getAllProducts();
    void updateProduct(Product product);
}