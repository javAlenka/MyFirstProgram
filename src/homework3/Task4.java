package homework3;

import java.util.Scanner;

public class Task4 {
    //    Вводится строка и две подстроки.  еобходимо заменить все вхождения одной подстроки на
//    другую.
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите подстроку для замены: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Введите подстроку, на которую нужно заменить: ");
        String replacementSubstring = scanner.nextLine();

        String resultString = inputString.replace(substringToReplace, replacementSubstring); // замена подстроки

        System.out.println("Результат: " + resultString);
    }
}
