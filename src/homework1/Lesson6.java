package homework1;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        if (length > 0) {
            int[] array = new int[length];
            System.out.println("Введите элементы массива:");

            for (int i = 0; i < length; i++) {
                System.out.print("Элемент " + i + ": ");
                array[i] = scanner.nextInt();
            }

            boolean exit = false;

            while (!exit) {
                System.out.print("Введите индекс элемента для вывода (отрицательное число для выхода): ");
                int index = scanner.nextInt();

                if (index < 0) {
                    exit = true; // Выход из цикла
                } else if (index >= 0 && index < length) {
                    int element = array[index];
                    System.out.println("Элемент с индексом " + index + " равен " + element);
                } else {
                    System.out.println("Введен недопустимый индекс.");
                }
            }
        } else {
            System.out.println("Длина массива должна быть положительным числом.");
        }
    }
}
