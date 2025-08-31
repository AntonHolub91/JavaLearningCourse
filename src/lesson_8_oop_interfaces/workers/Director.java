package lesson_8_oop_interfaces.workers;

public class Director implements Salary {
    @Override
    public void printPosition(){
        System.out.println("The employee created via class '" + getClass().getSimpleName() + "' is a director.");
    }
}