package lesson6task7;

public class SquareRootCalculator {

    public static double calculateSquare(double input){
        if(input < 0){
            throw new IllegalArgumentException("Nie można pierwiastkować ujemnej liczby");
        }else {
            return Math.sqrt(input);
        }
    }
}