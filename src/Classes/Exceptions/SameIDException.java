package Classes.Exceptions;

public class SameIDException extends RuntimeException{
    private String errorMessage;

    public SameIDException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
