package homework3;

import java.util.Scanner;

public class Task5 {
    //    HARD
//    Шифровка пароля.
//    Условие. еобходимо написать программу, которая принимает на вход пароль из 5 символов (строка из латинских букв и цифр) и шифрует его. ароль должен быть зашифрован следующим образом: каждая буква
//    должна быть заменена на код символа, а каждая цифра должна быть
//    увеличена на 1. Зашифрованный пароль должен быть выведен на экран.Требования:
//            1) программа должна считывать строку из латинских букв и цифр.
//2) программа изменяет строку согласно условию.
//3) программа должна выводить результат шифрования.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль (5 символов из латинских букв и цифр): ");
        String password = scanner.nextLine();

        StringBuilder encryptedPassword = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                // Если символ - буква, заменяем на его код
                encryptedPassword.append((int) ch);
            } else if (Character.isDigit(ch)) {
                // Если символ - цифра, увеличиваем на 1
                int digit = Character.getNumericValue(ch);
                digit = (digit + 1) % 10;
                encryptedPassword.append(digit);
            }
        }

        System.out.println("Зашифрованный пароль: " + encryptedPassword.toString());
    }
}
