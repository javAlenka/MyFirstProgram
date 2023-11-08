package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
//1. Ввести с клавиатуры массив из 10 чисел.
//2. Разбить его на 2 массива равной длинны.
//3. Отсортировать каждую из половинок и вывести их содержимое на экран.
    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println("Введите 10 чисел элементов массива:");
        for (int i = 0; i < num.length; i++) {
            Scanner scanner = new Scanner(System.in);
            num[i] = scanner.nextInt();
        }

        int halfLength = num.length / 2;
        int[] firstHalf = Arrays.copyOfRange(num, 0, halfLength);
        int[] secondHalf = Arrays.copyOfRange(num, halfLength, num.length);

        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);

        System.out.println("Первая половина, отсортированная: " + Arrays.toString(firstHalf));
        System.out.println("Вторая половина, отсортированная: " + Arrays.toString(secondHalf));
    }
}