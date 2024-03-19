package sqli.appessai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sqli.appessai.dto.ProductDTO;
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
    List<ProductDTO> getAllProduct()
    {
        return productSrevice.getAllProduct();
    }
}
