package lesson_8_oop_interfaces.figures;

public class Triangle extends Figure{
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateSquare(){
        double p = (double)(side1 + side2 + side3)/2;
        double square = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return square;
    }

    public double calculatePerimeter(){
        return side1 + side1 + side3;
    }
}