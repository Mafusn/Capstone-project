// Magnus Peetz Holt - mph21@student.aau.dk

package Classes.Exceptions;

public class SameNumberException extends RuntimeException{
    private String errorMessage;

    public SameNumberException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
