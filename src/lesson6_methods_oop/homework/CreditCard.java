package lesson6_methods_oop.homework;

// 1 Создать класс CreditCard c полями номер счета, текущая сумма на счету.
// Добавьте метод, который позволяет начислять сумму на кредитную карточку.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
// Добавьте метод, который выводит текущую информацию о карточке.
// Напишите программу, которая создает три объекта класса CreditCard у
// которых заданы номер счета и начальная сумма.
// Тестовый сценарий для проверки:
// Положите деньги на первые две карточки и снимите с третьей.
// Выведите на экран текущее состояние всех трех карточек.

public class CreditCard {
    String account_number;
    double balance;

    public CreditCard(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance was increased by $" + amount);
    }

    public void cashout(double amount) {
        balance -= amount;
        System.out.println("Balance was decreased by $" + amount);
    }

    public void showInfo() {
        System.out.println("Account number: " + account_number + ". Balance: $" + balance);
    }
}

class TestCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("PL00001", 199.99);
        CreditCard card2 = new CreditCard("PL00002", 299.00);
        CreditCard card3 = new CreditCard("PL00003", 399.5);

        card1.showInfo();
        card1.deposit(100.00);
        card1.showInfo();

        card2.showInfo();
        card2.deposit(1.99);
        card2.showInfo();

        card3.showInfo();
        card3.cashout(100.00);
        card3.showInfo();
    }
}
