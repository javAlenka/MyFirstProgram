package homework4;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    //Посчитать среднее значение листа интеджеров.
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(5, 6, 8, 11, 12, 13, 1, 2);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Среднее значение: " + average);
    }
}

