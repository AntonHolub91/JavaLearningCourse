package lesson8_oop_interfaces.hw_task_2_workers;

public class Accountant implements Salary {
    @Override
    public void printPosition(){
        System.out.println("The employee created via class '" + getClass().getSimpleName() + "' is an accountant.");
    }
}