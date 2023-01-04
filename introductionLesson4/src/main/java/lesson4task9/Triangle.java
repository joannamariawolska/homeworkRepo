package lesson4task9;

public class Triangle {

    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{width = " + width + ", height = " + height + "}";
        }
    }