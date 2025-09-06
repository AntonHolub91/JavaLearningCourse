package lesson8_oop_interfaces.hw_task_2_workers;

public class MyMain {
    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();

        director.printPosition();
        accountant.printPosition();
        worker.printPosition();
    }
}