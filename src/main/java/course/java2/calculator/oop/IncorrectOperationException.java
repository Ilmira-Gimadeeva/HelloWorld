package course.java2.calculator.oop;

public class IncorrectOperationException extends RuntimeException {
    public IncorrectOperationException(String message) {
        super(message);
    }
}
