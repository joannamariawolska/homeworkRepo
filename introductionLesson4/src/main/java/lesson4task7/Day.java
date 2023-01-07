package lesson4task7;

public class Day {

    public String convertToString(WeekDays day){
        return day.toString();
    }

    public static void main(String[] args) {

        Day day = new Day();
        System.out.println(day.convertToString(WeekDays.Monday));
    }
}