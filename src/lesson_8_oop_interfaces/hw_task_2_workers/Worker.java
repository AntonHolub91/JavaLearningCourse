package lesson_8_oop_interfaces.hw_task_2_workers;

// 2 Создать классы "Директор", "Рабочий", "Бухгалтер".
// Реализовать интерфейс с методом, который печатает название должности и
// имплементировать этот метод в созданные классы.

public class Worker implements Salary {
    @Override
    public void printPosition(){
        System.out.println("The employee created via class '" + getClass().getSimpleName() + "' is a worker.");
    }
}