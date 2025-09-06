package lesson8_oop_interfaces.hw_task_1_figures;

public class MyMain {
    public static void main(String[] args) {
        Calculations[] figures = {
                new Triangle(3, 4, 5),
                new Rectangle(3, 2, 3, 2),
                new Circle(3),
                new Rectangle(4, 4, 4, 4),
                new Circle(5),
        };

        double perimetersSum = 0;
        for (Calculations figure : figures) {
            System.out.println(figure.calculatePerimeter());
            perimetersSum += figure.calculatePerimeter();
        }
        double roundedPerimeterSum = Math.round(perimetersSum * 100) / 100.0;
        System.out.println("Sum of perimeters of all figures is " + roundedPerimeterSum + ".");
    }
}