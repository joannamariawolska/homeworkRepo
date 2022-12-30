package lesson4task2;

public class Square extends Shape{

    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return  sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    public double getSideA() {
        return sideA;
    }
}
