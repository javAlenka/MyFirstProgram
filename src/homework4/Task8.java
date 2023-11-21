package homework4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    //Получить числа из списка строк, затем найти максимум и минимум
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("5", "1", "3", "4", "22");

        List<Integer> numbers = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
