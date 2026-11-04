package day25.practice;

public class UserServiceException extends RuntimeException {

    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
