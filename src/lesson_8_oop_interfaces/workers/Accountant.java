package lesson_8_oop_interfaces.workers;

public class Accountant implements Salary {
    @Override
    public void printPosition(){
        System.out.println("The employee created via class '" + getClass().getSimpleName() + "' is an accountant.");
    }
}