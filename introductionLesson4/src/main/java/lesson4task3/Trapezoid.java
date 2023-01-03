package lesson4task3;

public class Trapezoid implements Shape{

    double sideA;
    double sideB;
    double sideC;
    double sideD;
    double height;

    public Trapezoid(double sideA, double sideB, double sideC, double sideD, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}