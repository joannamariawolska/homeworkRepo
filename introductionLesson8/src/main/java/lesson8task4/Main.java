package lesson8task4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Person> people = new TreeSet<>();
        people.add(new Person("Jan", "Kowalski", 1972, 185, 90));
        people.add(new Person("Adam", "Nowak", 1982, 184, 85));
        people.add(new Person("Anna", "Wiśniewska", 1962, 170, 60));

        Set<Person> sortedByHeight = new TreeSet<>(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        sortedByHeight.addAll(people);

        System.out.println("Lista od najniższego do najwyższego: ");
        for (Person person : sortedByHeight) {
            System.out.println(person.getName() + " " + person.getSurname());
        }

        Set<Person> sortedByWeight = new TreeSet<>(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getWeight(), o1.getWeight());
            }
        });
        sortedByWeight.addAll(people);

        System.out.println("\nLista od najcięższego do najlżejszego: ");
        for (Person person : sortedByWeight) {
            System.out.println(person.getName() + " " + person.getSurname());
        }

        System.out.println("\nLista od najmłodszego do najstarszego: ");
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getSurname());
        }
    }
}