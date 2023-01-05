package lesson4task8;

public class Main {
     public static void main(String[] args) {

         Person person1 = new Person("Anna", "Nowak", 30);
         Person person2 = new Person("Maria", "Kowalska", 35);
         Person person3 = new Person("Maria", "Kowalska", 35);

         System.out.println(person1.equals(person2));
         System.out.println(person2.equals(person3));
         System.out.println(person1.hashCode());
    }
}
