package pl.minecodes.mineveryusefuloperations.exception;

public class DumbUserException extends RuntimeException {

    public DumbUserException() {}

    public DumbUserException(String message) {
        super(message);
    }

    public DumbUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public DumbUserException(Throwable cause) {
        super(cause);
    }

    public DumbUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
