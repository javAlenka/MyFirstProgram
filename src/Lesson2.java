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
        if (l >= 2) {
            int[] array = new int[l];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int n = array[0]; // значение первого элемента
            array[0] = array[l - 1]; // array[n-1] значение последнего элемента
            array[l - 1] = n;
            System.out.println("Массив после замены: ");
            System.out.println(Arrays.toString(array));

            // Подсчет среднего арифметического элементов массива
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double average = sum / array.length;
            System.out.println("Среднее арифметическое элементов массива: " + average);
        } else {
            System.out.println("длина массива не может быть отрицательной и меньше двух элемнтов");
        }
    }
}
