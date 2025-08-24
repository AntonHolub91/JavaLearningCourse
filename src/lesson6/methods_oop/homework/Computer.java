package lesson6.methods_oop.homework;

// 1 Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD.
// Для полей RAM и HDD следует создать свои собственные классы. Классы для RAM и HDD должны иметь конструктор
// по умолчанию иконструктор со всеми параметрами. Класс RAM имеет поля "название" и "объем".
// Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
//Класс Computer должен иметь два конструктора:
// - первый - с параметрами стоимость и модель,
// - второй - со всеми полями.
// При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью
// конструкторов по умолчанию. В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей
// и всех значений).
// Тестовый сценарий для проверки:
// создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
// создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.

public class Computer {
    double price;
    String model;
    Ram ram;
    Hdd hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(double price, String model, Ram ram, Hdd hdd) {
        this(price, model);
        this.ram = ram;
        this.hdd = hdd;
    }

    public void showInfo() {
        System.out.println("Computer has following params:\n" +
                "- price: $" + price + ";\n" +
                "- model: " + model + ";\n" +
                "- RAM: " + ram.showInfo() + ";\n" +
                "- HDD: " + hdd.showInfo() + ";\n" +
                "-".repeat(30));
    }
}

class Ram {
    String name;
    int volume;

    public Ram() {}

    public Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String showInfo() {
        return ("Name: " + name + "; Volume: " + volume);
    }
}

class Hdd {
    String name;
    int volume;
    String type;

    public Hdd() {}

    public Hdd(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String showInfo() {
        return ("Name: " + name + "; Volume: " + volume + "; Type: " + type);
    }
}

class TestComputer {
    public static void main(String[] args) {
        Computer comp1 = new Computer(1000.00, "Model_1");
        comp1.showInfo();

        Ram ram = new Ram("HyperX", 32);
        Hdd hdd = new Hdd("Samsung", 1024, "internal");

        Computer comp2 = new Computer(1999.99, "Model_2", ram, hdd);
        comp2.showInfo();
    }
}