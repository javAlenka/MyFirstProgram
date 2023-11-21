package homework4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    //Отсортировать список строк в алфавитном порядке и в порядке убывания
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog", "raccoon", "cat");

        List<String> sortedAsc = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedDesc = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        System.out.println("В алфавитном порядке: " + sortedAsc);
        System.out.println("В порядке убывания: " + sortedDesc);
    }
}

