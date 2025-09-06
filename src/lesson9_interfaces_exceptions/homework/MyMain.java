package lesson9_interfaces_exceptions.homework;

public class MyMain {

    public static void main( String[] args) {
        try {
            Credentials.verifyCredentials("abc", "123", "124");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}