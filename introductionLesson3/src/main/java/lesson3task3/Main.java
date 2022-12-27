package lesson3task3;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Jan", "Kowalski", 2015, 10000);
        TicketSeller ticketSeller1 = new TicketSeller("Adam", "Nowak", 2018, 2550);

        System.out.println("Moje podstawowe wynagrodzenie: " + manager1.getSalary() + ". Pracuję w firmie: " + manager1.getWorkYears() + " lat.  Moje całkowite wynagrodzenie: " + manager1.calculateMonthlySalary() + ".");
        System.out.println("Moje podstawowe wynagrodzenie: " + ticketSeller1.getSalary() + ". Pracuję w firmie: " + ticketSeller1.getWorkYears() + " lat.  Moje całkowite wynagrodzenie: " + ticketSeller1.calculateMonthlySalary() + ".");
    }
}