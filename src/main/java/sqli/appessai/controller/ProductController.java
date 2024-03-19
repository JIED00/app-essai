package sqli.appessai.controller;

import org.springframework.web.bind.annotation.*;
import sqli.appessai.dto.ProductDTO;
import sqli.appessai.entity.Product;
import sqli.appessai.service.ProductSrevice;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {
    ProductSrevice productSrevice;

    public ProductController(ProductSrevice productSrevice) {
        this.productSrevice = productSrevice;
    }

    @GetMapping
    List<ProductDTO> getAllProduct() {
        return productSrevice.getAllProduct();
    }

    @PostMapping
    Product addProduct(@RequestBody ProductDTO productDTO) {
        return productSrevice.addProduct(productDTO);
    }
}
