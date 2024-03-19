package sqli.appessai.service;

import org.springframework.stereotype.Service;
import sqli.appessai.dto.ProductDTO;
import sqli.appessai.dto.ProductConverter;
import sqli.appessai.entity.Product;
import sqli.appessai.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(ProductConverter::toDTO)
                .collect(Collectors.toList());
    }
    public Product addProduct(ProductDTO productDTO) {
        Product product = ProductConverter.fromDTO(productDTO);

        return productRepository.save(product);
    }
    public void deleteProductById(String productId) {
         productRepository.deleteById(productId);
    }
}
