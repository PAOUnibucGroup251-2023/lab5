package ex1.model;

public class Triangle implements ex1.model.Polygon {
    private double a, b, c;

    public Triangle(double a, double b, double c) {}

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double perimeter = perimeter();
        return Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    }
}