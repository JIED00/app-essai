package sqli.appessai.exception;

public class NullCodeException extends RuntimeException {
    public NullCodeException() {
        super("code of the product must not be null");
    }
}
