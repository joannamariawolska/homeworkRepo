package lesson6task8;

public class PESELChecker {

    public static void validatePesel(String pesel) {

        try {
            Double.parseDouble(pesel);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("Proszę podawać liczby");
        }

        if (pesel.length() != 11) {
            throw new IllegalLengthException("Nieprawidłowa długość");
        }
    }
}