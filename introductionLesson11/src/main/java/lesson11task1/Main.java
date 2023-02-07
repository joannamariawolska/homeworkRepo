package lesson11task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static List<Long> generate(Long from, Long to) {
        return LongStream.rangeClosed(from, to)
                .filter(i -> i % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Long> list = generate(0L, 100L);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}