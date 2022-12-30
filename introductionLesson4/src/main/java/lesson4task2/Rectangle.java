package lesson4task2;

public class Rectangle extends Square{

    private double sideB;

    public Rectangle(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * getSideA() + 2 * sideB;
    }
}
