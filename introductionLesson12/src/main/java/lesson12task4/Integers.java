package lesson12task4;

import java.util.List;

public class Integers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 8, 12, 25);

        Thread averageThread = new Thread(() -> {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = (double) sum / numbers.size();
            System.out.println(average);
        });

        Thread sumThread = new Thread(() -> {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum);
        });

        averageThread.start();
        sumThread.start();
    }
}