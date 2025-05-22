package exceptions;

public class NotThereException extends Exception {
    public NotThereException(String message) {
        super(message);
    }

    public NotThereException() {
        super("This room doesnt exist.");
    }
}
