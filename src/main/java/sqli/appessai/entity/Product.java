package sqli.appessai.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sqli.appessai.exception.CategoryNotFoundException;
import sqli.appessai.exception.NonPositivePriceException;
import sqli.appessai.exception.NullCodeException;
import sqli.appessai.service.CategoryService;

@Getter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    String code;
    @Setter
    String label;
    double price;
    String categoryId;

    public Product(String code, String label, double price, String categoryId) {
        setCode(code);
        this.label = label;
        setPrice(price);
        this.categoryId = categoryId;

    }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
        else throw new NonPositivePriceException();
    }

    public void setCode(String code) {
        if (code != null) this.code = code;
        else throw new NullCodeException();

    }

    public void setCategoryId(String id) {
        if (CategoryService.isCategoryExist(id)) this.categoryId = id;
        else throw new CategoryNotFoundException(id);
    }


}
