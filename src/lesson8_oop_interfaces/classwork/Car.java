package lesson8_oop_interfaces.classwork;

public abstract class Car {
    String type;
    String model;

    public Car(String type, String model) {
        this.type = type;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car params: " +
                    "Type - " + type +
                    " Model - " + model;
    }
}
