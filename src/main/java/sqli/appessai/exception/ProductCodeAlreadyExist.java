package sqli.appessai.exception;

public class ProductCodeAlreadyExist extends RuntimeException{
    public ProductCodeAlreadyExist(String code) {
        super("product code: %s Already in the database".formatted(code));
    }
}
