package sqli.appessai.dto;

import sqli.appessai.entity.Product;

public class ProductConverter {

    public static ProductDTO toDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setLabel(product.getLabel());
        dto.setPrice(product.getPrice());
        return dto;
    }

    public Product fromDTO(ProductDTO dto) {
        Product product = new Product();
        product.setPrice(dto.getPrice());
        product.setLabel(dto.getLabel());
        product.setCode(dto.getCode());

        return product;
    }
}
