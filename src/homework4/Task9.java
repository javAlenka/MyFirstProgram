package homework4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    //Найти второй самый маленький и самый большой элементы в списке целых чисел
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 7, 3, 6, 4);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        int secondSmallest = sortedNumbers.get(1);
        int largest = sortedNumbers.get(sortedNumbers.size() - 1);

        System.out.println("Второй самый маленький элемент: " + secondSmallest);
        System.out.println("Самый большой элемент: " + largest);
    }
}
