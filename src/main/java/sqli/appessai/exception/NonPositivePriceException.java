package sqli.appessai.exception;

public class NonPositivePriceException extends RuntimeException {
    public NonPositivePriceException() {
        super("Price must be Positive");

    }
}
