package lesson7;

// 1 Класс Phone.
// Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого класса.
// Выведите на консоль значения их переменных.
// Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение
// “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
// Добавить конструктор в класс Phone, который принимает на вход три
// параметра для инициализации переменных класса - number, model и weight.
// Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
// Добавить конструктор без параметров. Вызвать из конструктора с тремя параметрами конструктор с двумя.
// Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
// Вызвать этот метод.
// Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым
// будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this("Unknown", "Unknown", 0);
    }

    @Override
    public String toString() {
        return "Number: " + number + ";\nModel: " + model + ";\nWeight: " + weight + ";\n" + "-".repeat(35);
    }

    public void receiveCall(String name) {
        System.out.println("Income call from " + name + "\n" + "-".repeat(35));
    }

    public void receiveCall(String name, String number) {
        System.out.println("Income call from " + name + ", " + number + "\n" + "-".repeat(35));
    }

    public void sendMessage(String... numbers) {
        System.out.println("Message is sent to following numbers:");
        for (String number : numbers) {
            System.out.println(number);
        }
        System.out.println("-".repeat(35));
    }

    public String getNumber() {
        return number;
    }
}

class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+48789648461", "Motorola");
        Phone phone3 = new Phone("+48789648462", "Nokia", 253);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Alex");
        phone2.receiveCall("John");
        phone3.receiveCall("Ann");

        phone1.receiveCall("Alex", "+375445861692");
        phone2.receiveCall("John", "+375297331490");
        phone3.receiveCall("Ann", "+375331912230");

        phone1.sendMessage("+375445861692", "+375297331490", "+375331912230", "+48789648461", "+48789648462");
    }
}
