package lesson_8_oop_interfaces.hw_task_1_figures;

public class Circle extends Rectangle {
    final double pi = 3.1428;
    int radius;

    public Circle(int radius){
        super(0,0,0,0);
        this.radius = radius;
    }

    @Override
    public double calculateSquare(){
        return pi * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return (Math.round(2 * pi * radius * 100)) / 100.0;
    }
}