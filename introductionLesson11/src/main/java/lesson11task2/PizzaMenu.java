package lesson11task2;

import java.util.Arrays;
import java.util.List;

public class PizzaMenu {
    List<Pizza> menu = Arrays.asList(
            new Pizza(true, Arrays.asList("mozzarella", "sos pomidorowy"), 600, "Margherita"),
            new Pizza(true, Arrays.asList("mozzarella", "sos pomidorowy", "pieczarki", "oregano"), 700, "Funghi"),
            new Pizza(false, Arrays.asList("mozzarella", "sos pomidorowy", "szynka", "oregano"), 720, "Prosciutto"),
            new Pizza(false, Arrays.asList("mozzarella", "sos pomidorowy", "salami", "oregano"), 780, "Salami"),
            new Pizza(true, Arrays.asList("mozzarella", "sos pomidorowy",  "pieczarki", "pomidor", "cebula", "ogórek", "kukurydza", "seler"), 650, "Vegeteriana"),
            new Pizza(false, Arrays.asList("mozarella", "sos pomidorowy", "kurczak z grilla", "ogórek konserwowy", "kukurydza", "oregano"), 890, "Chicken Pizza"),
            new Pizza(false, Arrays.asList("mozzarella", "sos pomidorowy", "bekon", "szynka parmeńska"), 790, "Prosciutto"),
            new Pizza(false, Arrays.asList("mozzarella", "sos serowo-śmietankowy", "pieczarki", "kiełbasa", "cebula"), 810, "Wiejska"),
            new Pizza(false, Arrays.asList("mozzarella", "sos pomidorowy", "szynka dojrzewająca", "pomidor", "rukola"), 840, "Parma"),
            new Pizza(false, Arrays.asList("mozarella", "sos serowo-śmietankowy", "boczek", "cebula", "sos pietruszka", "seler"), 900, "Carbonara")
    );

    public void searchMenu() {
        menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .forEach(System.out::println);
        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .forEach(System.out::println);
        if (menu.stream()
                .filter(pizza -> pizza.isVegetarian() && pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"))
                .findAny()
                .isPresent()) {
            System.out.println("W menu jest przynajmniej jedna pizza wegetariańska z pomidorem i papryką");
        } else {
            System.out.println("W menu nie ma pizzy wegetariańskiej z pomidorem i papryką");
        }

        if (menu.stream().allMatch(pizza -> pizza.getIngredients().contains("mozzarella"))){
            System.out.println("Wszystkie pizze zawierają mozzarellę");
        } else {
            System.out.println("Nie wszystkie dania zawierają mozzarellę");
        }

        Pizza pizzaMaxCal = menu.stream()
                .max((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()))
                .orElse(null);
        System.out.println("Najbardziej kaloryczna pizza: " + pizzaMaxCal.getName());

        Pizza pizzaMinCal = menu.stream()
                .min((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()))
                .orElse(null);
        System.out.println("Najmniej kaloryczna pizza: " + pizzaMinCal.getName());
    }

    public static void main(String[] args) {
        PizzaMenu pizzaMenu = new PizzaMenu();
        pizzaMenu.searchMenu();
    }
}