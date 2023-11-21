package homework4;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    //Посчитать сумму четных и нечетных элементов списка
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,6,7,21,1,8,9,11,10);

        int sumEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOdd = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма четных: " + sumEven);
        System.out.println("Сумма нечетных: " + sumOdd);
    }
}

