package sqli.appessai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sqli.appessai.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
