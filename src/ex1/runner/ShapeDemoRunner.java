package ex1.runner;

import ex1.model.Polygon;
import ex1.model.Triangle;

public class ShapeDemoRunner {
    public static void main(String[] args) {
        Polygon p = new Triangle(3, 4, 5);
        System.out.println("Perimeter: "+ p.perimeter());
        System.out.println("Area: " + p.area());
    }
}
