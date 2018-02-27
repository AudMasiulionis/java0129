package lesson13;

public class InvalidPasswordException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong username or password";
    }
}
