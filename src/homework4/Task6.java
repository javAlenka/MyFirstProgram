package homework4;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    //Посчитать количество строк в потоке, начинающихся с определенного символа
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "apricot", "kiwi");

        char startingChar = 'a';

        long count = strings.stream()
                .filter(str -> str.charAt(0) == startingChar)
                .count();

        System.out.println("Количество строк, начинающихся с " + startingChar + ": " + count);
    }
}
