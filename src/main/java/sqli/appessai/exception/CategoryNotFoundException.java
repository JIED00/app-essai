package sqli.appessai.exception;

public class CategoryNotFoundException extends RuntimeException{


    public CategoryNotFoundException(String categoryId) {

        super("Categories of id %s not found".formatted(categoryId));
    }
}
