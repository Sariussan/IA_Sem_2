package exceptions;

public class InventoryFullException extends Exception {
    public InventoryFullException(String message) {
        super(message);
    }

    public InventoryFullException() {
        super("Inventory is Full.");
    }
}
