package lesson_8_oop_interfaces.figures;

public class Rectangle extends Triangle {
    int side4;

    public Rectangle(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3);
        this.side4 = side4;
    }

    @Override
    public double calculateSquare(){
//        System.out.println("Square is: " + side1 * side2);
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter(){
//        System.out.println("Perimeter is: " + (side1 + side1 + side3 + side4));
        return side1 + side1 + side3 + side4;
    }
}