package lesson4task2;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    public double getSideA() {
        return sideA;
    }
}