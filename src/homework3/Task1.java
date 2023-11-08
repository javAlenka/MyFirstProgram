package homework3;

import java.util.Scanner;

public class Task1 {
    //    Цензура
//    Далеко не все слова можно и нужно
//    произносить вслух. апишем программу,
//    которая заменит все символы в заданном
//    слове, кроме первого и последнего, на символ *. апример, С УПРЯ -> C***Я
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово: ");
        String word = scanner.nextLine();

        if (word.length() < 3) {
            System.out.println("Слово слишком короткое для замены.");
            return;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        StringBuilder result = new StringBuilder();
        result.append(firstChar);

        for (int i = 1; i < word.length() - 1; i++) {
            result.append('*');
        }

        result.append(lastChar);

        System.out.println("Результат: " + result.toString());
    }

}
