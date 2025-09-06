package lesson9_interfaces_exceptions.homework;

public class Credentials {
    public static boolean verifyCredentials(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        boolean loginIsCorrect;
        boolean passwordIsCorrect;
        boolean confirmPasswordIsCorrect;

        loginIsCorrect = (login.length() < 20 && !login.contains(" ")) ? true : false;
        if (!loginIsCorrect) {
            throw new WrongLoginException("Invalid login");
        }

        passwordIsCorrect = (password.length() < 20 && !password.contains(" ")) ? true : false;
        if (!passwordIsCorrect) {
            throw new WrongPasswordException("Invalid password");
        }

        confirmPasswordIsCorrect = (password.equals(confirmPassword));
        if (!confirmPasswordIsCorrect) {
            throw new WrongPasswordException("Passwords are different");
        }

        return loginIsCorrect && passwordIsCorrect && confirmPasswordIsCorrect;
    }
}