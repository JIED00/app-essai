package sqli.appessai.exception;

public class CategoryNotFoundException extends RuntimeException{
    String CategoryId;

    public CategoryNotFoundException(String categoryId) {
        CategoryId = categoryId;
    }
}
