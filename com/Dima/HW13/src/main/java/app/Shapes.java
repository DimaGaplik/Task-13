package app;

public class Shapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(6),
                new Triangle(2, 5),
                new Square(2)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + area);
            //Добавил для проверки
            totalArea += area;
        }
        return totalArea;
    }
}
