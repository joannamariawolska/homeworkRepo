package lesson4task2;

public class Square extends Rectangle {

    public Square(double sideA){
        super(sideA);
    }

    @Override
    public double getArea() {
        return getSideA() * getSideA();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSideA();
    }
}