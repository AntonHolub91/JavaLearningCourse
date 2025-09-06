package lesson9_interfaces_exceptions.homework;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}