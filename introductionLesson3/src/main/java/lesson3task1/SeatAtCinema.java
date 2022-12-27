package lesson3task1;

public class SeatAtCinema {
    private final int number;
    private final int rowNumber;
    private boolean isAvailable;

    public SeatAtCinema(int number, int rowNumber) {
        this.number = number;
        this.rowNumber = rowNumber;
        this.isAvailable = true;
    }
    public String getMeMySeat(){
        return "Wybrane miejsce to " + number + ", w rzędzie " + rowNumber + " i jest wolne: " + isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
