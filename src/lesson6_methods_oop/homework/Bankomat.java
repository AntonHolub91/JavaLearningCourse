package lesson6_methods_oop.homework;

// Создать класс, описывающий банкомат.
// Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
// количеством купюр номиналом 20, 50 и 100
// Сделать метод для добавления денег в банкомат.
// Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
// выполнения операции. При снятии денег функция должна распечатывать каким количеством купюр какого номинала
// выдаётся сумма. Создать конструктор с тремя параметрами - количеством купюр каждого номинала.

class Bankomat {
    int banknote20;
    int banknote50;
    int banknote100;

    Bankomat(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    void deposit(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    int calculateSum() {
        return banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }

    boolean cashout(int amount) {
        if (amount > calculateSum()) {
            System.out.println("Cashout amount is more than ATM has.\n" + "-".repeat(35));
            return false;
        }

        if (amount < 20 && amount > 0) {
            System.out.println("ATM doesn't have such small banknotes.\n" + "-".repeat(35));
            return false;
        }

        if (amount <= 0) {
            System.out.println("Invalid input. It should be more than 0.\n" + "-".repeat(35));
            return false;
        }

        int banknoteRequired20 = 0;
        int banknoteRequired50 = 0;
        int banknoteRequired100 = 0;
        int banknoteToGive20 = 0;
        int banknoteToGive50 = 0;
        int banknoteToGive100 = 0;
        int restAfter100WasCalculated = 0;
        int restAfter50WasCalculated = 0;
        int restAfter20WasCalculated = 0;

        banknoteRequired100 = amount / 100;
        if (banknoteRequired100 <= this.banknote100) {
            banknoteToGive100 = banknoteRequired100;
        } else {
            banknoteToGive100 = this.banknote100;
        }
        restAfter100WasCalculated = amount - banknoteToGive100 * 100;

        banknoteRequired50 = restAfter100WasCalculated / 50;
        if (banknoteRequired50 <= this.banknote50) {
            banknoteToGive50 = banknoteRequired50;
        } else {
            banknoteToGive50 = this.banknote50;
        }
        restAfter50WasCalculated = restAfter100WasCalculated - banknoteToGive50 * 50;

        banknoteRequired20 = restAfter50WasCalculated / 20;
        if (banknoteRequired20 <= this.banknote20) {
            banknoteToGive20 = banknoteRequired20;
        } else {
            banknoteToGive20 = this.banknote20;
        }
        restAfter20WasCalculated = restAfter50WasCalculated - banknoteToGive20 * 20;

        System.out.println("ATM provided:\n" +
                "$100 banknotes - " + banknoteToGive100 + ";\n" +
                "$50 banknotes - " + banknoteToGive50 + ";\n" +
                "$20 banknotes - " + banknoteToGive20 + ";\n" +
                "Total: $" + (banknoteToGive100 * 100 + banknoteToGive50 * 50 + banknoteToGive20 * 20));

        if (restAfter20WasCalculated > 0) {
            System.out.println("ATM can't give you the rest: $" + restAfter20WasCalculated);
        }
        System.out.println("-".repeat(35));

        banknote20 -= banknoteToGive20;
        banknote50 -= banknoteToGive50;
        banknote100 -= banknoteToGive100;
        return true;
    }

    void showInfo() {
        System.out.println("ATM has following banknotes:\n" +
                "$100 - " + banknote100 + ";\n" +
                "$50 - " + banknote50 + ";\n" +
                "$20 - " + banknote20 + ";\n" +
                "Total: $" + calculateSum() + ".\n" +
                "-".repeat(35));
    }
}

class TestBankomat {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(4, 1, 1);
        bankomat.showInfo();
        bankomat.cashout(40);
        bankomat.showInfo();
    }
}