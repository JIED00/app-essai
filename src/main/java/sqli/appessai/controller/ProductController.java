package sqli.appessai.controller;

import org.springframework.web.bind.annotation.*;
import sqli.appessai.dto.ProductDTO;
import sqli.appessai.entity.Product;
import sqli.appessai.service.ProductService;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    List<ProductDTO> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping
    Product addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addProduct(productDTO);
    }
    @DeleteMapping("/{productId}")
    public void deleteProject(@PathVariable String productId) {
        productService.deleteProductById(productId);
    }
    @GetMapping("/{projectId}")
    public ProductDTO findProjectById(@PathVariable String projectId) {
        return productService.getProjectById(projectId);
    }
}
