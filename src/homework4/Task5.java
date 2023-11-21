package homework4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    // Убрать все дублирующиеся элементы из списка:
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Без дубликатов: " + distinctNumbers);
    }
}
