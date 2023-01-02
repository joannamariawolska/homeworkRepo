package lesson4task3;

public class Rhombus implements Shape {

    double sideA;
    double height;

    public Rhombus(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    @Override
     public double getArea() {
        return sideA * height;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }
}