package exceptions;

public class TooWeakException extends Exception {
    public TooWeakException(String message) {
        super(message);
    }

    public TooWeakException() {
        super("Hero is too weak to carry this.");
    }
}
