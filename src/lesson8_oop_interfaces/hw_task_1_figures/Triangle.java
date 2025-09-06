package lesson8_oop_interfaces.hw_task_1_figures;

public class Triangle implements Calculations {
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateSquare(){
        double p = (double)(side1 + side2 + side3)/2;
        double square = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return square;
    }

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}