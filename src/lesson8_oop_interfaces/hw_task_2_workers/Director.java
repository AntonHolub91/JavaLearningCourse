package lesson8_oop_interfaces.hw_task_2_workers;

public class Director implements Salary {
    @Override
    public void printPosition(){
        System.out.println("The employee created via class '" + getClass().getSimpleName() + "' is a director.");
    }
}