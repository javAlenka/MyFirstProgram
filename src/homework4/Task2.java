package homework4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    //Преобразовать список строк в верхний и нижний регистр
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog", "raccoon", "cat");

        List<String> upperCase = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<String> lowerCase = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Верхний регистр: " + upperCase);
        System.out.println("Нижний регистр: " + lowerCase);
    }
}

