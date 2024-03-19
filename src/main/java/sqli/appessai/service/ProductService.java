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

    static ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        ProductService.productRepository = productRepository;
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
    public ProductDTO getProjectById(String projectId) {
        Product product = productRepository.findById(projectId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));
        return ProductConverter.toDTO(product);
    }
    public static boolean isProductCodeAlreadyExist(String code)
    {
        return productRepository.findById(code).isPresent();
    }
    public ProductDTO updateProject( ProductDTO productDTO) {
        String productId=productDTO.getCode();
        Product existingProject = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));
        existingProject.setPrice(productDTO.getPrice());
        existingProject.setLabel(productDTO.getLabel());
        existingProject.setCategoryId(productDTO.getCategoryId());
        existingProject = productRepository.save(existingProject);
        return ProductConverter.toDTO(existingProject);
    }
}
