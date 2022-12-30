package lesson4task2;

public class Main {

    public static void main(String[] args){
            Shape square = new Square(4);
            Shape rectangle = new Rectangle(5, 6);
            Shape circle = new Circle(5);
            Shape triangle = new Triangle(3, 4, 5, 4);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
