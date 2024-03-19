package sqli.appessai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sqli.appessai.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
