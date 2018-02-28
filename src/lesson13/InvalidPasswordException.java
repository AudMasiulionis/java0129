package lesson13;

public class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong username or password";
    }
}
