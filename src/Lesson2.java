import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
//1. Задать массив целых чисел длинной N эл.
//2. Поменять 1-й и последний элемент местами.
//3. Вывести массив на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int l = scanner.nextInt();
        if (l >= 0) {
            int[] array = new int[l];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < array.length ; i++) {
                array[i] = scanner.nextInt();
            }
        }

    }
}
